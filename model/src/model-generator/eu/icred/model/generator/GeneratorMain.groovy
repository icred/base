package eu.icred.model.generator;

import org.joda.time.DateTime
import org.joda.time.LocalDate
import org.joda.time.Period

import eu.icred.model.generator.javacode.Annotation
import eu.icred.model.generator.javacode.BasicClass
import eu.icred.model.generator.javacode.Constructor
import eu.icred.model.generator.javacode.EnumClass
import eu.icred.model.generator.javacode.JavaClass
import eu.icred.model.generator.javacode.Method
import eu.icred.model.generator.javacode.Modifier
import eu.icred.model.generator.javacode.Property
import eu.icred.model.generator.javacode.writer.BasicClassWriter
import eu.icred.model.generator.javacode.writer.EnumClassWriter

/**
 * @author Pascal Houdek
 *
 */
public class GeneratorMain {

    private static Map<String, String> typeMap = ['iTYPE_Boolean': Boolean.class,
        'iTYPE_String': String.class,
        'iTYPE_Integer': Integer.class,
        'iTYPE_IntegerNonPositive': Integer.class,
        'iTYPE_IntegerNonNegative': Integer.class,
        'iTYPE_IntegerPositive': Integer.class,
        'iTYPE_IntegerNegative': Integer.class,

        'iTYPE_Decimal': Double.class,
        'iTYPE_DecimalNonPositive': Double.class,
        'iTYPE_DecimalNonNegative': Double.class,
        'iTYPE_DecimalPositive': Double.class,
        'iTYPE_DecimalNegative': Double.class,

        'iTYPE_Percentage': Double.class,
        'iTYPE_PercentageNonPositive': Double.class,
        'iTYPE_PercentageNonNegative': Double.class,
        'iTYPE_PercentagePositive': Double.class,
        'iTYPE_PercentageNegative': Double.class,
        'iTYPE_Percentage0To100': Double.class,

        'iTYPE_Uri': URI.class,

        'iTYPE_Date': LocalDate.class,
        'iTYPE_LocalDate': LocalDate.class,
        'iTYPE_Period': Period.class,
        'iTYPE_DateTime': DateTime.class,

        'iTYPE_Language': Locale.class,
        'iTYPE_Locale': Locale.class,
        'iTYPE_Currency': Currency.class,

        'iTYPE_Process': String.class,
        'iTYPE_Version': String.class]


    private static Property elementToProperty(String elementLine) {
        String typeString = (elementLine =~ 'type="([A-Za-z0-9_]*)"')[0][1]

        Property prop = new Property()
        if(typeString.startsWith('eTYPE')) {
            prop.type = new BasicClass(packageName:'eu.icred.model.datatype.enumeration', name:typeString[6..-1])
        } else if(typeString.startsWith('iTYPE')) {
            prop.type = BasicClass.fromClass(typeMap[typeString]) as BasicClass
        } else if(typeString.startsWith('sTYPE')) {
            String simpleName = typeString[6..-1]
            if(simpleName.equals("ExtensionMap")) {
                prop = null
            } else if(['Amount', 'Area'].contains(simpleName)) {
                prop.type = new BasicClass(packageName:'eu.icred.model.datatype', name:simpleName)
            } else if(['Address', 'EnergyRating'].contains(simpleName)) {
                prop.type = new BasicClass(packageName:'eu.icred.model.node.group', name:simpleName)
            }
        } else if(typeString.contains("ListOf")) {
            String propertyName = typeString[11].toLowerCase() + typeString[12..-1]
            if(propertyName.endsWith('y')) {
                propertyName = propertyName[0..-2] + 'ies'
            } else {
                propertyName += 's'
            }
            prop.name = propertyName
            prop.type = new JavaClass(packageName:'java.util', name:'Map<String, ' +  typeString[11..-1] + '>')
        }

        if(prop) {
            assert prop.type

            prop.modifier = Modifier.PROTECTED
            if(!prop.name) {
                prop.name = (elementLine =~ 'name="([A-Za-z0-9_]*)"')[0][1]
            }
            prop.defaultSetter = true
            prop.defaultGetter = true
        }

        return prop
    }

    public static void main(String[] args) {

        File xsdDir = new File(/D:\workspace\altova\zgif\zgif\xsd/)
        File srcDir = new File(/.\src\model-generated/)
        Helper.delete(srcDir)

        // generate Entity-Nodes
        xsdDir.eachFileMatch({ it.startsWith('entity_') }) { File entityXsdFile ->
            BasicClass entity
            entityXsdFile.eachLine { String line, int lineNumber ->
                if(line.contains('<xs:complexType name="TYPE_') && !line.contains("ListOf")) {
                    entity = new BasicClass()
                    entity.name = (line =~ 'name="TYPE_([A-Za-z0-9_]*)"')[0][1]
                    entity.packageName = 'eu.icred.model.node.entity'
                    entity.superClass = new BasicClass(packageName:'eu.icred.model.node.entity', name:'AbstractEntityNode')
                    entity.annotations.add new Annotation(packageName:'eu.icred.model.annotation', name:'Node')
                }

                if(entity != null) {
                    if(line.contains('</xs:complexType>')) {
                        new BasicClassWriter(entity).writeToSrcDir(srcDir)
                        entity = null
                    }
                    try {
                        if(line.contains('xs:element') || line.contains('xs:attribute')) {
                            Property prop = elementToProperty(line)
                            if(prop != null) {
                                if(prop.type.name.startsWith('Map<')) {
                                    prop.annotations.add new Annotation(packageName:'eu.icred.model.annotation', name:'ChildList');
                                } else if(prop.type.packageName.equals('eu.icred.model.node.group')) {
                                    prop.annotations.add new Annotation(packageName:'eu.icred.model.annotation', name:'GroupNode');
                                } else if(line.contains('xs:element')) {
                                    prop.annotations.add new Annotation(packageName:'eu.icred.model.annotation', name:'DataField');
                                } else {
                                    prop.annotations.add new Annotation(packageName:'eu.icred.model.annotation', name:'Attribute');
                                }
                                entity.properties.add prop
                            }
                        }
                    } catch(Throwable e) {
                        throw new Exception("Fehler beim lesen der xsd-Datei '${entityXsdFile.name}' in Zeile #$lineNumber: $line", e)
                    }
                }
            }
        }


        // generate Group-Nodes, Datafield-Types, Extension Map
        BasicClass curSub
        new File(xsdDir, 'types_sub.xsd').eachLine { String line, int lineNumber ->
            if(line.contains("<xs:complexType")) {
                String simpleName = (line =~ 'name="[A-Za-z]+_([A-Za-z0-9_]*)"')[0][1]

                if(['Amount', 'Area'].contains(simpleName)) {
                } else if(['Address', 'EnergyRating'].contains(simpleName)) {
                    curSub = new BasicClass(packageName:'eu.icred.model.node.group', name:simpleName)
                    curSub.superClass = new JavaClass('eu.icred.model.node.group', 'AbstractGroupNode')
                }
            }

            if(curSub != null) {
                try {
                    if(line.contains('xs:element')) {
                        Property prop = elementToProperty(line)
                        if(prop) {
                            prop.annotations.add new Annotation(packageName:'eu.icred.model.annotation', name:'DataField');
                            curSub.properties.add prop
                        }
                    }
                } catch(Throwable e) {
                    throw new Exception("Fehler beim lesen der xsd-Datei 'types_sub.xsd' in Zeile #$lineNumber: $line", e)
                }
                if(line.contains("</xs:complexType>")) {
                    new BasicClassWriter(curSub).writeToSrcDir(srcDir)
                    curSub = null
                }
            }
        }


        // generate enumerations:
        EnumClass curEnum
        new File(xsdDir, 'types_enumeration.xsd').eachLine { String line ->
            if(line.contains("<xs:simpleType")) {
                String simpleName = (line =~ 'name="eTYPE_([A-Za-z0-9_]*)"')[0][1]
                curEnum = new EnumClass(packageName:'eu.icred.model.datatype.enumeration', name: simpleName)
            }

            if(curEnum != null) {
                if(line.contains("</xs:simpleType>")) {
                    new EnumClassWriter(curEnum).writeToSrcDir(srcDir)
                    curEnum = null
                }
                if(line.contains('<xs:enumeration')) {
                    curEnum.values.add((line =~ 'value="([A-Za-z0-9_]*)"')[0][1])
                }
                if(line.contains('<xs:pattern')) {
                    String pattern = (line =~ 'value="(.*)"')[0][1]

                    Property prop = new Property()
                    prop.type = JavaClass.fromClass(String.class)
                    prop.name = 'value'
                    prop.modifier = Modifier.PRIVATE

                    BasicClass patternEnum = new BasicClass(packageName:'eu.icred.model.datatype.enumeration', name: curEnum.name)

                    Constructor enumConstruct = new Constructor()
                    enumConstruct.baseClass = patternEnum
                    enumConstruct.throwses.add JavaClass.fromClass(Exception.class)
                    enumConstruct.variableMap.put prop, prop
                    enumConstruct.preBody = "if(!value.matches(\""+pattern+"\")) {\r\n  throw new Exception(\"not permitted value '\"+value+\"' for ProjectCostCategory. pattern: "+pattern+"\");\r\n}"

                    Method mToString = new Method()
                    mToString.name = "toString"
                    mToString.returnType = JavaClass.fromClass(String.class)
                    mToString.body = "return value;"

                    patternEnum.properties.add prop
                    patternEnum.contructors.add(enumConstruct)
                    patternEnum.methods.add(mToString)

                    new BasicClassWriter(patternEnum).writeToSrcDir(srcDir)

                    curEnum = null
                }
            }
        }
    }
}
