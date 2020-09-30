import java.util.Scanner;

/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 28/09/2020
 */

public class Lamp {
    String name;
    String colorOfLight;
    String location;
    String isItOn;

    // Class constructor
    public Lamp(String name, String colorOfLight, String location, String isItOn){
        this.name = name;
        this.colorOfLight = colorOfLight;
        this.location = location;
        this.isItOn = isItOn;
    }

    //Method getLampName for calculation in method
    public String getLampName(){
        return name;
    }

    //Color of the lamp lights setting method


    public String getColorOfLight() {
        return colorOfLight;
    }
    public String getColorOfLight(String colorOfLight){
        return colorOfLight;
    }
    public void setColorOfLight(String colorOfLight){
        this.colorOfLight= colorOfLight;
    }

    public String getLocation(String location){
        return location;
    }

    //Light settings method
    public String getLight(String isItOn) {
        return isItOn;
    }
    public void setLight(String isItOn) {
        isItOn = "yes";
    }

    //Method to create lamps and check for calculation

    //How to extract only one of the parameters

    public void makeLampWorkCalculation() {
        System.out.println("Are there movement for the area the lamp covers?: ");
        Scanner input = new Scanner(System.in);
        String movementInput = input.nextLine();



    }
}



