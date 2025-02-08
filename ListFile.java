import java.util.LinkedList;
import java.util.Scanner;

public class ListFile{
    public static void main(String[] args) throws Exception {
        //creates a linked list of type vehicle
        LinkedList<Vehicle> vehicleList = new LinkedList<Vehicle>();
        //initializes scanner and variables
        Scanner scnr = new Scanner(System.in);
        String make;
        String model;
        Double mpg;

        //loop that continues until there is no input left
        while(scnr.hasNext() == true){
            try{
                //scans values into VehicleList linked list
                make = scnr.next();
                model = scnr.next();
                mpg = scnr.nextDouble();
                vehicleList.add(new Vehicle(make, model, mpg));
                //creates message for invalid mpg input
                if(mpg < 6 || mpg > 90){
                    throw new IllegalArgumentException("That is not a valid miles per gallon input!");
                }
            //catches if the mpg input is between 6 - 90 as there shouldn't be an mpg outside of that range
            }catch(IllegalArgumentException e){
                //prints catch message
                System.out.println(e.getMessage());
            }
        }
        //closes scanner
        scnr.close();
        
    }

}