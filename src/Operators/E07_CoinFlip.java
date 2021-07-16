
//: Objects/E07_CoinFlip.java
/*********************** Exercise 6 ******************************
 * Write a program that simulates coin-flipping.
 ****************************************************************/

package Operators;

import java.util.Random;

public class E07_CoinFlip {
    public static void main(String[] args){
        Random rand = new Random(); //seeded on the current time
        boolean flip = rand.nextBoolean();
        System.out.print("RESULT: ");
        System.out.println(flip ? "HEAD" : "TAIL");
    };
}
