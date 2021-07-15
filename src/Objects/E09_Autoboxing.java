//: Objects/E09_StaticTest.java
/*********************** Exercise 9 ******************************
 * Write a program that demonstrates that autoboxing works for all
 * primitive types and their wrappers.
 ****************************************************************/
package Objects;
public class E09_Autoboxing {
    public static void main(String[] args){
                      // byte x = 1;
        Byte by = 1;  // Byte by = new Byte(x);
        byte bt = by;
        System.out.println("byte = " + bt);

        Short sh  = 1;// <-- is autoboxing, convert prim->class
        short s = sh; // <-- is autoboxing, and back
        System.out.println("short = " + s);

        Integer in  = 1;
        int i = in;
        System.out.println("int = " + i);

        Boolean bo  = true;
        boolean b = bo;
        System.out.println("boolean = " + b);

        Character ch  = 'x';
        char c = ch;
        System.out.println("char = " + c);

        Float fl  = 1.0f;
        float f = fl;
        System.out.println("float = " + f);

        Double db  = 1.0d;
        double d = db;
        System.out.println("double = " + d);


    };
}
