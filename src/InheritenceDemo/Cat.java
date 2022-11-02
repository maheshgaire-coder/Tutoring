package InheritenceDemo;

public class Cat extends Animal{
    Cat(String name, int weight, String color, int numOfLegs) {
        super(name, weight, color, numOfLegs);
    }

    public void speak(){
        String output = String.format("%s says meow", name);
        System.out.println(output);
    }
}
