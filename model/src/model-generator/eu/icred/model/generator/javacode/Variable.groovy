/**
 * 
 */
package eu.icred.model.generator.javacode

import groovy.transform.TupleConstructor

/**
 * @author Pascal Houdek
 *
 */
@TupleConstructor(includes=['type', 'name'])
class Variable {
    JavaClass type
    String name
}
