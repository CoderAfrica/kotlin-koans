package i_introduction._9_Extension_Functions;

import util.JavaCode;

public class JavaCode9 extends JavaCode {

    public String javaCode9 = "2";

    public void useExtension() {
        char c = N09ExtensionFunctionsKt.lastChar("abc");
    }

    public static void extensionJava(JavaCode9 javaCode9){
         String result = javaCode9.javaCode9+" wantever i want to do";
         doSomethingImportant(result);
    }

    public static void doSomethingImportant(String result){
        //important
        lastChar(result);
    }

    //abcde
    //abce.last
    //fun String.lastChar() = this.get(this.length - 1)
    public static String lastChar(String value){
        //e
        return value.substring(value.length()-1);
    }

}
