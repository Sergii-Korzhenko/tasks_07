package dz_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {

        String email1 = "2343gus@gmail.com";
        String email2 = "pirogov54@rambler.com";
        String email3 = "anna17@ukr.net";
        System.out.println(domain(email1,email2, email3));

    }
    public static String domain(String email1, String email2, String email3){
        String regex = "(.*)@(.*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher1 = pattern.matcher(email1);
        Matcher matcher2 = pattern.matcher(email2);
        Matcher matcher3 = pattern.matcher(email3);


        matcher1.find();
        String domain1 = matcher1.group(2);

        matcher2.find();
        String domain2 = matcher2.group(2);

        matcher3.find();
        String domain3 = matcher3.group(2);

        return domain1 + ", " + domain2 + ", " + domain3;
    }


}
