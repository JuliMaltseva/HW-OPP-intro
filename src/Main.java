public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Lada";
        car1.model = "Granta";
        car1.engineVolume = 1.7;
        car1.color = "желтый";
        car1.year = 2015;
        car1.country = "Россия";
        car1.displayInfo();

        Car car2 = new Car();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.engineVolume = 3.0;
        car2.color = "черный";
        car2.year = 2020;
        car2.country = "Германия";
        car2.displayInfo();

        Car car3 = new Car();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.engineVolume = 3.0;
        car3.color = "черный";
        car3.year = 2021;
        car3.country = "Германия";
        car3.displayInfo();

        Car car4 = new Car();
        car4.brand = "Kia";
        car4.model = "Sportage 4-го поколения";
        car4.engineVolume = 2.4;
        car4.color = "красный";
        car4.year = 2018;
        car4.country = "Южная Корея";
        car4.displayInfo();

        Car car5 = new Car();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.engineVolume = 1.6;
        car5.color = "оранжевый";
        car5.year = 2016;
        car5.country = "Южная Корея";
        car5.displayInfo();



    }
}