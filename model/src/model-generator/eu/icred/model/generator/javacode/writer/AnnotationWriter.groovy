/**
 * 
 */
package eu.icred.model.generator.javacode.writer;

import eu.icred.model.generator.javacode.Annotation

/**
 * @author Pascal Houdek
 *
 */
public class AnnotationWriter {

    Annotation annotation
    public AnnotationWriter(Annotation annotation) {
        this.annotation = annotation
    }

    public void writeToStream(OutputStream stream) {
        stream << "@${annotation.name}\r\n"
    }
}
