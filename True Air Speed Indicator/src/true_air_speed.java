

import static java.lang.Math.round;

public class true_air_speed {
    public static void tas(){

        int altitude = 60000, indicated_speed = 2005;//variables
        double tas = 1895 / (1 + (55000 * 0.00002)); //formula for calculating teh TAS

        System.out.println("Assuming the aircraft is traveling at a speed of 1,895mph, \n" +
                "with an altitude of 55,000ft... \n" +
                "************************************************************ \n" +
                "The true airspeed of this aircraft is: " + Math.round(tas) + "mph" + "\n" +
                "************************************************************ \n" );


    }



}

