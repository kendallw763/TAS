//dashboard for the user to learn and view the calculations of aerospace systems
public class info_dash{
    public static void showDash(){
        System.out.println("");

        System.out.println("************************************************************\n" +
                "                        (TAS)/(IAS)\n" +
                "************************************************************ \n" +
                "Before moving on, there is information " +
                "you must know \n" +

                "to have a better understanding of one of the various \n" +
                "embedded systems and how they work within " +
                "high-speed,\nhigh-altitude aircraft. \n" +

                "\nThe true air speed indicator measures the actual speed \n" +
                "of an aircraft. \n" +

                "\nThe indicated air speed is a rough estimate of aircraft \n" +
                "speed. This is due to the combination of various altitudes, \n" +
                "speeds, weights, etc...\n" +
                "\nThe pressure inside and outside of the aircraft are how the" +
                "\nrough speed (IAS) and the TRUE rate of speed" +
                "\n(TAS) can be calculated. \n" +
                "************************************************************ \n" +
                "\n" +
                "\n"+

                "************************************************************ \n" +
                "                          EXAMPLE  \n" +
                "************************************************************ \n" +
                "An F-111 Aardvark traveling at 2,005 mph with the \n" +
                "altitude of 60,000 feet, high alt. means fewer air particles \n" +
                "thus, the (TAS) will read a higher rate of speed due to less \n" +
                "ram pressure, meaning less flight restrictions than the (IAS) \n" +
                "which roughly measures the pressure inside the aircraft \n" +
                "therefore, only 'INDICATING' speed... \n" +
                "************************************************************ \n" +
                " \n" +

                "\n"+
                "************************************************************ \n" +
                "                        DEFINITIONS \n" +
                "************************************************************ \n" +
                " - Static Pressure - \n" +
                "[The pressure of the atmosphere at flight level...] \n" +
                " \n" +

                "- Ram Pressure - \n" +
                "[The pressure of the plane in forward motion against the air] \n" +

                "\n- Pitot Pressure - \n" +
                "[The pressure measure by the Pitot tube] \n" +
                "************************************************************ \n"

        );
    }

}
