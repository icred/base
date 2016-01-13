/**
 * 
 */
package eu.icred.model.generator.javacode.writer;

import eu.icred.model.generator.javacode.Annotation
import eu.icred.model.generator.javacode.Constructor
import eu.icred.model.generator.javacode.Variable


/**
 * @author Pascal Houdek
 *
 */
public class ConstructorWriter {

    Constructor constructor
    public ConstructorWriter(Constructor constructor) {
        this.constructor = constructor
    }

    OutputStream stream
    public void writeToStream(OutputStream stream) {
        this.stream = stream;

        writeAnnotations();
        writeModifier();
        writeName()
        writeVariables()
        writeThrowses()
        writeBody()
    }
    
    protected void writeAnnotations() {
        if(constructor.annotations) {
            constructor.annotations.each { Annotation annotation ->
                new AnnotationWriter(annotation).writeToStream(stream)
            }
        }
    }
    protected void writeThrowses() {
        if(constructor.throwses) {
            stream << " throws "
            stream << constructor.throwses.join(', ')
            stream << " "
        }
    }
    protected void writeModifier() {
        stream << constructor.modifier.toString() + " "
    }
    protected void writeName() {
        stream << constructor.baseClass.name
        stream << " "
    }
    protected void writeVariables() {
        stream << "("
        stream << constructor.variableMap.values().collect { Variable var -> "${var.type.name} ${var.name}" }.join(', ')
        stream << ")"
    }
    protected void writeBody() {
        stream << " {\r\n"
        if(constructor.preBody) {
            stream << constructor.preBody
            stream << "\r\n"
        }
        stream << constructor.variableMap.collect { Variable from, Variable to ->
            "  this.$to.name = $from.name;"
        }.join("\r\n")
        if(constructor.postBody) {
            stream << "\r\n"
            stream << constructor.postBody
        }
        stream << "}\r\n"
    }
}
