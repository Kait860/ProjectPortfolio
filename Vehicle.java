public class Vehicle {
    private String make;
    private String model;
    private Double mpg;

    public Vehicle(String make, String model, Double mpg){
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public Double getMpg(){
        return mpg;
    }

    public String toString(){
        return "Make: " + make + " Model: " + model + " Miles Per Gallon: " + mpg;
    }
}
