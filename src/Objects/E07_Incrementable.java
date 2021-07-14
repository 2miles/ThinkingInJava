package Objects;

//: Objects/E07_Incrementable.java
/*********************** Exercise 6 ******************************
 * Turn the Incrementabvle() code fragments into a working program.
 ****************************************************************/

class StaticTest {
    // All StaticTest objects will share the same i.
    static int i = 420;
}

public class E07_Incrementable {
    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args){

        E07_Incrementable inc = new E07_Incrementable();
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        // These all increment the same thing because E07.increment()
        // is static
        inc.increment();
        E07_Incrementable.increment();
        increment();

        // These all print the same thing because i is static
        System.out.println(StaticTest.i);
        System.out.println(st1.i);
        System.out.println(st2.i);

    };
}
