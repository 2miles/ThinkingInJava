package Control;
//: Objects/E01_To100.java
/*********************** Exercise 1 ******************************
 * Write a program that prints values from 1 to 100
 ****************************************************************/
public class E01_To100 {
    public static void main(String[] args) {
       for (int i = 1; i <= 100; i++) {
           if (i < 10)
               System.out.print( i + "  ");
           else
               System.out.print( i + " ");
           if (i%10 == 0)
               System.out.print("\n");
       }
    }
}
