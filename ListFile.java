import java.util.Collections;
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
        double mpg = 0.0;

        //loop that continues until 'quit' is inputted
        while(true){
                //prompts user for make and scans
                System.out.println("Enter the make of the vehicle (or 'quit' to finish)");
                make = scnr.next();
                if(make.equalsIgnoreCase("quit")){
                    break;
                }
                
                //prompts user for model and scans
                System.out.println("Enter the model of the vehicle(or 'quit' to finish)");
                model = scnr.next();
                if(model.equalsIgnoreCase("quit")){
                    break;
                }

                //prompts user for mpg value and loops until a valid input is found using try and catch statements
                while(true){
                    System.out.println("Enter the miles per gallon on the vehicle");
                    try{
                        mpg = scnr.nextDouble();
                        if(mpg <= 0){
                            System.out.println("Miles Per Gallon cannot be zero or less");
                        }
                        else{
                            break;
                        }
                    }catch(NumberFormatException e){
                        System.out.println("Invalid Input. Please enter a values greater than 0");
                    }
                }
                //adds information to vehicle list creating a new vehicle object
                vehicleList.add(new Vehicle(make, model, mpg));
        }
        //closes scanner
        scnr.close();

        //tells user thank you and informs them that the information will be printed to a file
        System.out.println("Thank you for your input. The vehicles will all be printed to a file.");

        //sorts the vehicles into ascending order based upon their mpg value
        Collections.sort(vehicleList);
        
        for(int i = 0; i < vehicleList.size(); i++){
            System.out.println(vehicleList.get(i));
        }
    }
}