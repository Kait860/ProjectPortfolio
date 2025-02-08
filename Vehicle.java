public class Vehicle implements Comparable<Vehicle>{
    private String make;
    private String model;
    private double mpg;

    //method used to create new Vehicle object
    public Vehicle(String make, String model, double mpg){
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    @Override
    public int compareTo(Vehicle v){
        if(mpg > v.mpg){
            return 1;
        }
        else if(mpg == v.mpg){
            return 0;
        }
        else{
            return -1;
        }
    }


    //the method I am going to use to easily print the information to the file
    public String toString(){
        return "Make: " + make + ", Model: " + model + ", Miles Per Gallon: " + mpg + "\n";
    }
}
