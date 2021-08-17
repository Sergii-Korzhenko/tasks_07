package dz_7;

public class Check_date_time {
    public static void main(String[] args) {

        String date1 = "2005/05/17 04:58";
        String date2 = "1975/12/20 24:58";
        String date3 = "kjdshew/12/04 12:20";

        String regex = "[0-9][0-9][0-9][0-9]/[0-9][0-9]/[0-9][0-9]\\s[0-2][0-9]:[0-5][0-9]";
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
