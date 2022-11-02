package InheritenceDemo;

public class Main {
    public static void main(String[] args){
        Dog bruno = new Dog("Bruno", 30, "Black", 4, "Labrador");
        bruno.info();
        System.out.println("Breed : " + bruno.getBreed());
        bruno.speak();

        System.out.println();
        Cat kitty = new Cat("Kitty", 10, "White", 4);
        kitty.info();
        kitty.speak();
    }
}
