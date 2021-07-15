//: Objects/E02_Alaising.java
/*********************** Exercise 2 ******************************
 * Create a class containing a float and use it to demonstrate
 * aliasing during method calls.
 ****************************************************************/
package Operators;

class Integral {
    float f;
}

public class E02_Aliasing {
    public static void main(String[] args){
        Integral n1 = new Integral();
        Integral n2 = new Integral();
        n1.f = 420f;
        n2.f = 69f;
        System.out.println("n1.f: " + n1.f + ", n2.f " + n2.f);
        n1 = n2; //n1 and n2 are now both referencing the object n2.
        System.out.println("n1 = n2") ;
        System.out.println("n1.f: " + n1.f + ", n2.f " + n2.f);
        n1.f = 27f;
        System.out.println("n1.f = 27f") ;
        System.out.println("n1.f: " + n1.f + ", n2.f " + n2.f);
        //You can see the efect of alaising after n2 is assigned to
        // n1: they both point to the same object
    };
}
