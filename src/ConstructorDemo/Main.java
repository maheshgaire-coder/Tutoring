package ConstructorDemo;

public class Main {
    public static void main(String[] args){
//        Dog unNamedDog = new Dog();
////        unNamedDog.bark();
//
////initializing the fields of unNamedDog
//         unNamedDog.name = "Dave";
//        unNamedDog.bark();

        ConstructorDemo.Dog Bruno = new ConstructorDemo.Dog("Bruno", "Black With White Stripes", 20);
        Bruno.bark();
//        Bruno.info();

    }
}
