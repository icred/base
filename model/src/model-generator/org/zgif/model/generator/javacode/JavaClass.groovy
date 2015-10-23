package org.zgif.model.generator.javacode;

import groovy.transform.EqualsAndHashCode
import groovy.transform.TupleConstructor

/**
 * @author Pascal Houdek
 *
 */
@TupleConstructor(includes=['packageName', 'name'])
@EqualsAndHashCode(includes=['packageName', 'name'])
public class JavaClass implements Comparable {

    Modifier modifier = Modifier.PUBLIC
    String packageName
    String name
    List<Annotation> annotations = []
    List<Method> methods = []

    public JavaClass() {
    }

    @Override
    public int compareTo(Object other) {
        return (packageName + name).compareTo(other.packageName + other.name);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "${packageName}.${name}"
    }

    public static JavaClass fromClass(Class clazz) {
        JavaClass jc = new JavaClass()
        jc.packageName = clazz.getPackage().getName()
        jc.name = clazz.getSimpleName()
        return jc
    }

    Object asType(Class clazz) {
        if(this.class.isAssignableFrom(clazz)) {
            Object x = clazz.newInstance()
            x.packageName = this.packageName
            x.name = this.name
            return x
        }
        return null
    }
}
