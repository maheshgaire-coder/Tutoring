package ConstructorDemo;

public class Dog {
    public String name;
    public String color;
    public int weight;

    public Dog(){

    }

    public Dog(String Name, String Color, int Weight){
        name = Name;
        color = Color;
        weight = Weight;
    }

    public void bark(){
        if (name != null){
            String output = String.format("%s says woof", name);
            System.out.println(output);
        }
        else {
            System.out.println("woof");
        }
    }

    public void info(){
        String output = String.format("%s is %s and weighs %s pounds", name, color, weight);
    }
}
