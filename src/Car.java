public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    void displayInfo (){
        System.out.println(toString());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, " +
                "страна сборки - " + country +
                ", цвет кузова - " + color +
                ", объем двигателя - " + engineVolume + " л.";
    }



}
