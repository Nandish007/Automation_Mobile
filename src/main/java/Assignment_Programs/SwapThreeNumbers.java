package Assignment_Programs;

public class SwapThreeNumbers {

    public static void main(String[] args) {

        int x=10,y=20,z=30;

        System.out.println("Before Swappimg");
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

        System.out.println("After Swappimg");
        x=x+y+z;
        y=x-(y+z);
        z=x-(y+z);
        x=x-(y+z);
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }
}
