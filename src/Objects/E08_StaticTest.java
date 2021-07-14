package Objects;

public class E08_StaticTest {
    static int i = 420;
    public static void main(String[] args){
        E08_StaticTest test1 = new E08_StaticTest();
        E08_StaticTest test2 = new E08_StaticTest();

        //All print the same thing
        System.out.println(test1.i);
        System.out.println(test2.i);
        System.out.println(i);

        //These 2 lines should increment i by 2
        test1.i++;
        i++;

        System.out.println("After incrementing test1: ");
        System.out.println("test1.i " + test1.i);
        System.out.println("test2.i " + test2.i);

    };
}
