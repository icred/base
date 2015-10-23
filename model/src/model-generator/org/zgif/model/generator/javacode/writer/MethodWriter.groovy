/**
 * 
 */
package org.zgif.model.generator.javacode.writer;

import org.zgif.model.generator.javacode.Annotation
import org.zgif.model.generator.javacode.Constructor
import org.zgif.model.generator.javacode.Method
import org.zgif.model.generator.javacode.Variable

/**
 * @author Pascal Houdek
 *
 */
public class MethodWriter {

    Method method
    public MethodWriter(Method method) {
        this.method = method
    }

    OutputStream stream
    public void writeToStream(OutputStream stream) {
        this.stream = stream;

        writeAnnotations();
        writeModifier();
        writeReturnType()
        writeName()
        writeVariables()
        writeThrowses()
        writeBody()
    }
    
    protected void writeAnnotations() {
        if(method.annotations) {
            method.annotations.each { Annotation annotation ->
                new AnnotationWriter(annotation).writeToStream(stream)
            }
        }
    }
    protected void writeThrowses() {
        if(method.throwses) {
            stream << " throws "
            stream << method.throwses.join(', ')
            stream << " "
        }
    }
    protected void writeModifier() {
        stream << method.modifier.toString() + " "
    }
    protected void writeName() {
        stream << method.name
        stream << " "
    }
    protected void writeReturnType() {
        stream << method.returnType.name
        stream << " "
    }
    protected void writeVariables() {
        stream << "("
        stream << method.variables.collect { Variable var -> "${var.type.name} ${var.name}" }.join(', ')
        stream << ")"
    }
    protected void writeBody() {
        stream << " {\r\n"
        stream << method.body
        stream << "}\r\n"
        stream << "\r\n"
    }
}
