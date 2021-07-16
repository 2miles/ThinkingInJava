package Operators;
//: Objects/E06_Dogs2.java
/*********************** Exercise 5 ******************************
 * Following Ex 5, assign a new Dog reference to Spots's object.
 * Test for comparison using == and equals() for all references.
 ****************************************************************/

public class E06_Dogs2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Spot";  dog1.says = "ruff!";
        dog2.name = "Scruffy";  dog2.says = "wurf!";
        dog1.display();
        dog2.display();

        Dog dogRef = dog1;

        System.out.println("Using comparison operator: ");
        System.out.println("dog1 == dog2 : " + (dog1 == dog2));
        System.out.println("dog1.name == dog2.name : " + dog1.name == dog2.name);
        System.out.println("dog1.says == dog2.says : " + dog1.says == dog2.says);
        System.out.println();
        System.out.println("dog1 == dogRef : " + (dog1 == dogRef));
        System.out.println("dog1.name == dogRef.name : " + dog1.name == dogRef.name);
        System.out.println("dog2.name == dogRef.name : " + dog2.name == dogRef.name);
        System.out.println();
        System.out.println("dog2 == dogRef : " + (dog2 == dogRef));
        System.out.println("dog1.says == dogRef.says : " + dog1.says == dogRef.says);
        System.out.println("dog2.says == dogRef.says : " + dog2.says == dogRef.says);
        System.out.println();
        System.out.println("Using equals(): ");
        System.out.println("dog1.equals(dog2) : " + dog1.equals(dog2));
        System.out.println("dog1.name.equals(dog2.name) : " + dog1.name.equals(dog2.name));
        System.out.println("dog1.says.equals(dog2.says) : " + dog1.says.equals(dog2.says));
        System.out.println();
        System.out.println("dog1.equals(dogRef) : " + dog1.equals(dogRef));
        System.out.println("dog1.name.equals(dogRef.name) : " + dog1.name.equals(dogRef.name));
        System.out.println("dog1.says.equals(dogRef.says) : " + dog1.says.equals(dogRef.says));
        System.out.println();
        System.out.println("dog2.equals(dogRef) : " + dog2.equals(dogRef));
        System.out.println("dog2.name.equals(dogRef.name) : " + dog2.name.equals(dogRef.name));
        System.out.println("dog2.says.equals(dogRef.says) : " + dog2.says.equals(dogRef.says));


    };
}
