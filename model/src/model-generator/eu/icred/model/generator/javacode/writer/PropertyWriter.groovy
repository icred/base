/**
 * 
 */
package eu.icred.model.generator.javacode.writer;

import eu.icred.model.generator.javacode.Annotation
import eu.icred.model.generator.javacode.Property


/**
 * @author Pascal Houdek
 *
 */
public class PropertyWriter {

    Property property
    public PropertyWriter(Property property) {
        this.property = property
    }

    OutputStream stream
    public void writeToStream(OutputStream stream) {
        this.stream = stream;

        writeAnnotations();
        writeModifier();
        writeType()
        writeName()
        if(property.defaultGetter) {
            writeGetter()
        }
        if(property.defaultSetter) {
            writeSetter()
        }
    }

    protected void writeAnnotations() {
        if(property.annotations) {
            property.annotations.each { Annotation annotation ->
                new AnnotationWriter(annotation).writeToStream(stream)
            }
        }
    }
    protected void writeModifier() {
        stream << property.modifier.toString() + " "
    }
    protected void writeType() {
        stream << "${property.type.name} "
    }
    protected void writeName() {
        stream << property.name + ";\r\n"
    }
    protected void writeGetter() {
        stream << "  public "+ property.type.name +" get${property.name[0].toUpperCase()}${property.name[1..-1]}() {\r\n"
        stream << "    return this.${property.name};\r\n"
        stream << "  }\r\n"
    }
    protected void writeSetter() {
        stream << "  public void set${property.name[0].toUpperCase()}${property.name[1..-1]}("+ property.type.name +" ${property.name}) {\r\n"
        stream << "    this.${property.name} = ${property.name};\r\n"
        stream << "  }\r\n"
    }
}
