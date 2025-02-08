public class Vehicle {
    private String make;
    private String model;
    private Double mpg;

    //method used to create new Vehicle object
    public Vehicle(String make, String model, Double mpg){
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    //the method I am going to use to easily print the information to the file
    public String toString(){
        return "Make: " + make + " Model: " + model + " Miles Per Gallon: " + mpg + "\n";
    }
}
