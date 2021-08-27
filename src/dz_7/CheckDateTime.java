package dz_7;

public class CheckDateTime {
    public static void main(String[] args) {

        String date1 = "2005/12/31 23:59";
        String date2 = "1975/05/22 35:15";
        String date3 = "kjdshew/12/04 12:02";

        String regex = "[0-9][0-9][0-9][0-9]/((0[1-9])|(1[0-2]))/((0[1-9])|(1[0-9])|(2[0-9])|(3[0,1]))\\s" +
                "((0[0-9])|(1[0-9])|(2[0-3])):[0-5][0-9]";

        boolean matched1 = date1.matches(regex);
        boolean matched2 = date2.matches(regex);
        boolean matched3 = date3.matches(regex);

        System.out.println("Date and time check:");

        if (matched1 == true) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        if (matched2 == true) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
        if (matched3 == true) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
