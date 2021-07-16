package Operators;

//: Objects/E05_Dogs.java
/*********************** Exercise 5 ******************************
 * Show that hex and octal notations work with long values. Use
 * Long.toBinaryString() to display the results.
 ****************************************************************/
public class E08_LongLiterals {

    public static void main(String[] args){
        long l1 = 0x2f; //Hex lower
        System.out.println("l1: " + Long.toBinaryString(l1));
        long l2 = 0X2F; //Hex upper
        System.out.println("l2: " + Long.toBinaryString(l2));
        long l3 = 0177; //Octal
        System.out.println("l3: " + Long.toBinaryString(l3));
    };
}

// Note, Long.binaryToString() does not print leading zeroes.
