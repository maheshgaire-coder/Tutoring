package Interfaces;

public class Car implements Vehicle{
    String model;
    int weight;
    String manufacturer;
    int horsePower;

    Car(String model, String manufacturer, int horsePower, int weight){
        this.model = model;
        this.manufacturer = manufacturer;
        this.horsePower = horsePower;
        this.weight = weight;
    }

    @Override
    public void info() {
        String info = String.format("This car %s was made by %s, has %s horsepower and weighs %s lbs",
                model, manufacturer, horsePower, weight);
        System.out.println(info);
    }

    @Override
    public void turnOnLight() {
        System.out.println("Turning on lights! .....");
    }

    @Override
    public void Start() {
        System.out.println("Starting the engine! vrrrrrr....vrrrr...");
    }


}
