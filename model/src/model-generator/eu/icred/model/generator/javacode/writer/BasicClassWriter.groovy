/**
 * 
 */
package eu.icred.model.generator.javacode.writer;

import java.io.File;
import java.util.Set;

import eu.icred.model.generator.javacode.BasicClass
import eu.icred.model.generator.javacode.JavaClass;

/**
 * @author Pascal Houdek
 *
 */
public class BasicClassWriter extends JavaClassWriter {
    BasicClass bClazz
    public BasicClassWriter(BasicClass clazz) {
        super(clazz);

        bClazz = clazz
    }

    /* (non-Javadoc)
     * @see eu.icred.model.generator.javacode.writer.JavaClassWriter#writeClassName()
     */
    @Override
    protected void writeClassName() {
        super.writeClassName();
        if(bClazz.superClass) {
            writeSuperClass()
        }
        if(bClazz.interfaces) {
            writeInterfaces()
        }
    }

    protected void writeSuperClass() {
        stream << " extends ${bClazz.superClass.name}"
    }
    protected void writeInterfaces() {
        stream << " implements "
        stream << bClazz.interfaces.join(', ')
    }

    /* (non-Javadoc)
     * @see eu.icred.model.generator.javacode.writer.JavaClassWriter#setUsedClasses(java.util.Set)
     */
    @Override
    public void collectUsedClasses() {
        super.collectUsedClasses();

        if(bClazz.superClass) {
            this.usedClasses.add(bClazz.superClass)
        }
        if(bClazz.interfaces) {
            this.usedClasses.addAll(bClazz.interfaces)
        }
        if(bClazz.properties) {
            bClazz.properties.each { prop ->
                this.usedClasses.add prop.type
                this.usedClasses.addAll prop.annotations
            }
        }
    }

    /* (non-Javadoc)
     * @see eu.icred.model.generator.javacode.writer.JavaClassWriter#writeBody()
     */
    @Override
    protected void writeBody() {
        bClazz.properties.each { prop ->
            new PropertyWriter(prop).writeToStream(stream)
        }
        bClazz.contructors.each { constructor ->
            new ConstructorWriter(constructor).writeToStream(stream)
        }
        super.writeBody();
    }
}
