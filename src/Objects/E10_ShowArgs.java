//: Objects/E10_ShowArgs.java
/*********************** Exercise 9 ******************************
 * Wrote a program tha prints three arguments taken from the
 * command line.
 ****************************************************************/
package Objects;
//To add command line args to a program build
//run -> edit configuration -> command line arguments
public class E10_ShowArgs {
    public static void main(String[] args){
        if(args.length < 3)
        {
            System.err.println("Need 3 arguments");
            System.exit(1);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    };
}
