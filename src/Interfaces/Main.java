package Interfaces;

public class Main {
    public static void main(String[] args){
        Car myCar = new Car("2022 Acura NSX Type S", "Acura", 600, 3878);
        myCar.info();
        myCar.turnOnLight();
        myCar.Start();
    }
}
