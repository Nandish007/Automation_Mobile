package Assignment_Programs;

public class ReverseAString {
    public static void main(String[] args) {

        String str="Nandish";
       String r="";
        char ch;

        System.out.println("The Length of the String is: " +str.length());

        for(int i=0;i<str.length();i++)
        {
            ch= str.charAt(i);
            r=ch+r;
        }
        System.out.println("The Reverse String is: " +r);


    }
}
