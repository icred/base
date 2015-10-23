/**
 * 
 */
package org.zgif.model.generator.javacode;

/**
 * @author Pascal Houdek
 *
 */
public enum Modifier {
    PUBLIC, PRIVATE, DEFAULT, PROTECTED;

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
