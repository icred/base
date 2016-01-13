/**
 * 
 */
package eu.icred.model.generator.javacode;

import java.util.List;
import java.util.Map;

/**
 * @author Pascal Houdek
 *
 */
public class Method {
    
    List<Annotation> annotations = []
    Modifier modifier = Modifier.PUBLIC
    JavaClass returnType
    List<JavaClass> throwses = []
    List<Variable> variables = []
    String name
    String body

}
