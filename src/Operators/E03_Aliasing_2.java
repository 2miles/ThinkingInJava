package Operators;
//: Objects/E03_Alaising_2.java
/*********************** Exercise 3 ******************************
 * Create a class containing a float and use it to demonstrate
 * aliasing during method calls.
 ****************************************************************/

public class E03_Aliasing_2 {
    static void f(Integral y) {
        y.f = 1.0f;
    }
    public static void main(String[] args){
        Integral x = new Integral();
        x.f = 2.0f;
        System.out.println("x.f: " + x.f);
        f(x);
        System.out.println("f(x) ");
        System.out.println("x.f: " + x.f);
    };
    //This exercise emphasized that you're always passing references
    // around, thus you're always aliasing.

    //In C this would not of affected the object being sent into the
    //function because it would be a copy.

}
