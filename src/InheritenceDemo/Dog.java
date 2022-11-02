package InheritenceDemo;

public class Dog extends Animal {
    public String breed;
    Dog(String name, int weight, String color, int numOfLegs){
        super(name, weight, color, numOfLegs);
    }

    Dog(String name, int weight, String color, int numOfLegs, String breed){
        super(name, weight, color, numOfLegs);
        this.breed = breed;
    }

    public void speak(){
        String output = String.format("%s says woof", name);
        System.out.println(output);
    }

    public String getBreed(){
        return this.breed;
    }
}
