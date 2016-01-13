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
public class Constructor extends Method {
    BasicClass baseClass
    Map<Variable, Variable> variableMap = [:]
    String preBody
    String postBody
}
