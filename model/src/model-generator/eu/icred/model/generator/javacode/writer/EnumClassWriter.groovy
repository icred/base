/**
 * 
 */
package eu.icred.model.generator.javacode.writer;

import eu.icred.model.generator.javacode.EnumClass


/**
 * @author Pascal Houdek
 *
 */
public class EnumClassWriter extends JavaClassWriter {
    EnumClass eClazz
    public EnumClassWriter(EnumClass clazz) {
        super(clazz);

        eClazz = clazz
    }

    /* (non-Javadoc)
     * @see eu.icred.model.generator.javacode.writer.JavaClassWriter#writeClassName()
     */
    @Override
    protected void writeClassType() {
        stream << "enum "
    }

    /* (non-Javadoc)
     * @see eu.icred.model.generator.javacode.writer.JavaClassWriter#writeBody()
     */
    @Override
    protected void writeBody() {
        stream << eClazz.values.join(', ')
        stream << ";\r\n"
        
        super.writeBody();
    }
}
