import java.util.Objects;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (isBrand(brand)) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        if (isModel(model)) {
            this.model = model;
        } else {
            this.model = "default";
        }

        if (isEngineVolume(engineVolume)) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (isColor(color)) {
            this.color = color;
        } else {
            this.color = "белый";
        }

        if (isYear(year)) {
            this.year = year;
        } else {
            this.year = 2000;
        }

        if (isCountry(country)) {
            this.country = country;
        } else {
            this.country = "default";
        }
    }

    private boolean isBrand(String brand) {
        if (brand == null || brand == "") {
            return false;
        }
        return true;
    }

    private boolean isModel(String model) {
        if (model == null || model == "") {
            return false;
        }
        return true;
    }

    private boolean isCountry(String country) {
        if (country == null || country == "") {
            return false;
        }
        return true;
    }

    private boolean isEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            return false;
        }
        return true;
    }

    private boolean isColor(String color) {
        if (color == null || color == "") {
            return false;
        }
        return true;
    }

    private boolean isYear(double year) {
        if (year <= 0) {
            return false;
        }
        return true;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 &&
                year == car.year && brand.equals(car.brand) &&
                model.equals(car.model) && Objects.equals(color, car.color)
                && country.equals(car.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, year, country);
    }
}
