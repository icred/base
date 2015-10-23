
package org.zgif.model.generator.javacode;

import groovy.transform.ToString
import groovy.transform.TupleConstructor


@TupleConstructor(includes=['packageName', 'name'], includeSuperFields=true)
public class EnumClass extends JavaClass {
    List<String> values = []

    public static EnumClass fromClass(Class clazz) {
        EnumClass bc = new EnumClass()
        bc.packageName = clazz.getPackage().getName()
        bc.name = clazz.getSimpleName()
        return bc
    }
    
    
}
