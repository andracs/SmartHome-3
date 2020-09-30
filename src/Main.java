import java.util.Scanner;

/**
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 28/09/2020
 */

public class Main {

    static Dør hoveddør = new Dør();
    static Dør bagdør  = new Dør();
    static Dør bryggersDør  = new Dør();
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

        tænd(lampStaircase, movementInTheStaircase);
        tænd(lampHallway, movementInTheHallway);

        lukHusetNed();

    }

    private static void lukHusetNed() {
        hoveddør.lås();
        bagdør.lås();
    }

    static void tænd(Lamp lampe, String movement) {
        if(movement.equals("yes")){
            if(lampe.getLight("no").equals("no")){
                if (lampe.getColorOfLight("white").equals("white")) {
                    lampe.setColorOfLight("soft yellow");
                    lampe.setLight("yes");
                    System.out.println("The lights is now on in the "+lampe.location+" and the color of the light is changed to: " + lampe.getColorOfLight());
                }else if (lampe.getColorOfLight("soft yellow").equals("soft yellow")){
                    System.out.println("The lamp in the Hallway is on and has a " + lampe.getColorOfLight() + " light");
                    lampe.setLight("yes");
                }else {
                    System.out.println("Error, restart system");
                }
                //lampStaircase.setLight("yes");
            }else{
                //delay 30sec
                System.out.println("Delay for 30 seconds");
                lampe.setLight("no");
                System.out.println("The lamp in the staircase is now: " + lampe.getLight("no"));
            }
        }else if(movement.equals("no")){
            //nothing
            System.out.println("No movement in the staircase therefore no lights on");
        }
    }


    static void tændv2(Lamp lampe, String movement) {

    }


}

