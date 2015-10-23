/**
 * 
 */
package org.zgif.model.generator.javacode.writer;

import org.zgif.model.generator.Helper
import org.zgif.model.generator.javacode.Annotation
import org.zgif.model.generator.javacode.JavaClass
import org.zgif.model.generator.javacode.Method

abstract public class JavaClassWriter {

    JavaClass clazz
    public JavaClassWriter(JavaClass clazz) {
        this.clazz = clazz
    }

    public void writeToSrcDir(File srcDir) {
        File srcFile = new File(Helper.traversalFile(srcDir, clazz.packageName.split(/\./)), clazz.name + '.java')
        srcFile.parentFile.mkdirs()
        writeToSrcFile(srcFile)
    }

    public void writeToSrcFile(File srcFile) {
        assert !srcFile.exists() || srcFile.canWrite()
        writeToStream(srcFile.newOutputStream())
    }

    OutputStream stream
    public void writeToStream(OutputStream pStream) {
        stream = pStream

        writePackage();
        writeImports();
        writeClassAnnotations();
        writeClassModifier();
        writeClassType()
        writeClassName()
        stream << " {\r\n"
        stream << "\r\n"
        writeBody()
        stream << "}"
    }

    protected void writePackage() {
        stream << "package $clazz.packageName;\r\n"
        stream << "\r\n"
    }

    Set<JavaClass> usedClasses = []
    protected void collectUsedClasses() {
        usedClasses.addAll this.clazz.annotations
    }
    protected void writeImports() {
        collectUsedClasses();
        
        def cutGeneric = {
            int pos = it.indexOf('<')
            if(pos > 0) pos--
            return it[0..pos]
        }
        
        Set<String> imports = usedClasses.collect { "import ${it.packageName}.${cutGeneric(it.name)};\r\n" }
        stream << imports.sort().join("")
        stream << "\r\n"
    }
    protected void writeClassAnnotations() {
        if(clazz.annotations) {
            clazz.annotations.each { Annotation annotation ->
                new AnnotationWriter(annotation).writeToStream(stream)
            }
        }
    }
    protected void writeClassModifier() {
        stream << clazz.modifier.toString() + " "
    }
    protected void writeClassType() {
        stream << "class "
    }
    protected void writeClassName() {
        stream << "$clazz.name"
    }
    protected void writeBody() {
        writeMethods()
    }
    protected void writeMethods() {
        if(clazz.methods) {
            clazz.methods.each { Method method ->
                new MethodWriter(method).writeToStream(stream)
            }
        }
    }
}
