package Assignment_Programs;

public class SwapTwoNumber {
    public static void main(String[] args) {

        int a=50,b=100;
        System.out.println("Befer Swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println("After Swapping");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
