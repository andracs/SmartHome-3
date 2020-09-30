import java.util.Scanner;

/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 28/09/2020
 */

public class Main {

// Opgave 2
//  Vælg en af de "opfindelser", som du har fundet på, og skriv nogle klasser, som kan modellere din opfindelse.
//  Skriv også en Main-klasse, der viser, hvordan dit smarthome-devices kunne fungere.

//  "Opfindelse": Lampe, som automatisk tænder et svagt lys så man kan se hvor på trappen man går om natten.

    public static void main(String[] args) {
        Lamp lampStaircase = new Lamp("LampStaircase","white", "staircase","no");
        Lamp lampHallway = new Lamp("lampHallway", "soft yellow", "hallway", "no");

        System.out.println("Alle lamper oprettet");
        System.out.println("***************************");
        System.out.println("");

        System.out.println("Are there movement in the hallway?: ");
        Scanner input = new Scanner(System.in);
        String movementInTheHallway = input.nextLine().toLowerCase();

        System.out.println("Are there movement in the staircase?: ");
        String movementInTheStaircase = input.nextLine().toLowerCase();

        if(movementInTheHallway.equals("yes")){
            if(lampHallway.getLight("no").equals("no")) {
                if (lampHallway.getColorOfLight("white").equals("white")) {
                    lampHallway.setColorOfLight("soft yellow");
                    lampHallway.setLight("yes");
                    System.out.println("The lights is now on in the hallway and the color of the light is changed to: " + lampHallway.getColorOfLight());
                }else if (lampHallway.getColorOfLight("soft yellow").equals("soft yellow")){
                    System.out.println("The lamp in the Hallway is on and has a " + lampHallway.getColorOfLight() + " light");
                    lampHallway.setLight("yes");
                }else {
                    System.out.println("Error, restart system");
                }
            }else{
                //delay 30sec
                System.out.println("Delay for 30 seconds");
                lampHallway.setLight("no");
                System.out.println("The lamp in the hallway is now: " + lampHallway.getLight("no"));
            }
        }else if(movementInTheHallway.equals("no")){
            //nothing
            System.out.println("No movement in the hallway therefore no lights on");
        }

        if(movementInTheStaircase.equals("yes")){
            if(lampStaircase.getLight("no").equals("no")){
                if (lampStaircase.getColorOfLight("white").equals("white")) {
                    lampStaircase.setColorOfLight("soft yellow");
                    lampStaircase.setLight("yes");
                    System.out.println("The lights is now on in the staircase and the color of the light is changed to: " + lampStaircase.getColorOfLight());
                }else if (lampStaircase.getColorOfLight("soft yellow").equals("soft yellow")){
                    System.out.println("The lamp in the Hallway is on and has a " + lampStaircase.getColorOfLight() + " light");
                    lampStaircase.setLight("yes");
                }else {
                    System.out.println("Error, restart system");
                }
                //lampStaircase.setLight("yes");
            }else{
                //delay 30sec
                System.out.println("Delay for 30 seconds");
                lampStaircase.setLight("no");
                System.out.println("The lamp in the staircase is now: " + lampStaircase.getLight("no"));
            }
        }else if(movementInTheStaircase.equals("no")){
            //nothing
            System.out.println("No movement in the staircase therefore no lights on");
        }
    }
}

