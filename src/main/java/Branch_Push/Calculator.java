package Branch_Push;

import java.util.Scanner;

public class Calculator {

    public void add(int x,int y)
    {
        int sum=x+y;
        System.out.println("The sum of 2 numbers is: "+sum);
    }
    public void sub(int a,int b)
    {
     int sum=a-b;
        System.out.println("The sub of 2 numbers is: "+sum);
    }
    public int div(int a,int b)
    {
        int div=a/b;
        return div;
    }
    public void String()
    {
        String s= "Nandish";
        System.out.println("The length of the string is: "+s.length());
        System.out.println("My Name is: "+s);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st Numbers: ");
        int First=sc.nextInt();
        System.out.println("Enter the 2st Numbers: ");
        int Second=sc.nextInt();

        Calculator c= new Calculator();
        c.add(First,Second);
        c.sub(First,Second);
        int X=c.div(5,3);
        System.out.println("The div of 2 number is: "+X);
        c.String();
    }


}
