/**
 * 
 */
package org.zgif.model.generator.javacode.writer;

import org.zgif.model.generator.javacode.Annotation

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
