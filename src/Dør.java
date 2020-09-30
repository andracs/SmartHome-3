/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 30/09/2020
 */

public class Dør {

    String navn;

    void lås() {
        System.out.println("Døren låses.");
    }

    void låsOp() {
        System.out.println("Døren låses op.");
    }

    void åbn() {
        System.out.println("Døren åbnes op.");
    }

    void luk() {
        System.out.println("Døren lukkes.");
    }

    void setNavn(String x) {
        this.navn = x;
    }


}
