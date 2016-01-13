
package eu.icred.model.generator.javacode;

import groovy.transform.ToString
import groovy.transform.TupleConstructor


@TupleConstructor(includes=['packageName', 'name'], includeSuperFields=true)
public class BasicClass extends JavaClass {
    JavaClass superClass
    List<BasicClass> interfaces = []
    List<Property> properties = []
    List<Constructor> contructors = []
    
}
