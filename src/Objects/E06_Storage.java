//: Objects/E06_Storage.java
/*********************** Exercise 6 ******************************
 * Write a program that includes and calls the storage() method
 * defined as a code fragment in this chapter.
 ****************************************************************/
package Objects;

public class E06_Storage {

    String s = "Portland Oregon";
    int storage(String s) {
        return s.length() * 2;
    }
    void print() {
        System.out.println("storage(s) = " + storage(s));
    }
    public static void main(String[] args){
        E06_Storage storage = new E06_Storage();
        storage.print();
    };
}
