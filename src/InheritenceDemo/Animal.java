package InheritenceDemo;

public class Animal {
    public String name;
    public int weight;
    public String color;
    public int numOfLegs;

    Animal (String name, int weight, String color, int numOfLegs){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.numOfLegs = numOfLegs;
    }

    public void speak(){
        System.out.println(".......");
    }

    public void info(){
        String info = String.format("%s is %s color, weighs %s pounds and has %s legs", name, color, weight,  numOfLegs);
        System.out.println(info);
    }
}


