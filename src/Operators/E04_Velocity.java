package Operators;
//: Objects/E04_Velocity.java
/*********************** Exercise 3 ******************************
 * Write a program that calculates velocity using a
 * constant distance and constant time.
 ****************************************************************/

public class E04_Velocity {
    public static void main(String[] args){
        if(args.length < 2) {
            System.err.println(
                    "Usage: java E04_Velocity distance time"
            );
            System.exit(1);
        }
        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[0]);
        System.out.println("Velocity = ");
        System.out.println(distance / time);
    };
}
// Here we take the distance and time values from the command line.
// Arguments come in as a String array; if you need a float instead,
// use the static parseFloat() method of class Float.