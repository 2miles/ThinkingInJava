package Objects;
//: Objects/E05_DataOnly_2.java
/*********************** Exercise 4 ******************************
 * Turn the code fragments involving DataOnly into a program that
 * compiles and runs
 ****************************************************************/

public class E05_DataOnly_2
{
    int i;
    double d;
    boolean b;

    public static void main(String[] args)
    {
        E04_DataOnly data = new E04_DataOnly();

        data.i = 47;
        data.d = 1.1;
        data.b = false;

        System.out.println("data.i = " + data.i);
        System.out.println("data.d = " + data.d);
        System.out.println("data.b = " + data.b);
    }


}
