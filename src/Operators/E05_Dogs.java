package Operators;
//: Objects/E05_Dogs.java
/*********************** Exercise 5 ******************************
 * Create a class called Dog containing two Strings: name and says.
 * In main(), create two dog objects with names "spot" (who says,
 * "Ruff!") and "scruffy" (who says, "Wurf!"). Then display their
 * names and what they say.
 ****************************************************************/


class Dog {
    String name;
    String says;
    void display() {
        System.out.println(this.name + " says " + this.says);
    }
}

public class E05_Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Spot";  dog1.says = "ruff!";
        dog2.name = "Scruffy";  dog2.says = "wurf!";
        dog1.display();
        dog2.display();
    };
}
