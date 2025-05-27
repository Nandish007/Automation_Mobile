package Tutorialsninja;

import java.util.Date;

public class TimeToGenerateMail {

    public static void main(String[] args) {

        Date date = new Date();
        String s= date.toString();
       String str=s.replaceAll(" ","");
       String str1=str.replaceAll(":","");
       String NewEmail= str1+"@gmail.com";
        System.out.println(NewEmail);
    }
}
