package Branch_Push;

public class CalculatorMultiple {

    public int mul(int x,int y,int z)
    {
        int sum=x*y*z;
        return sum;
    }

    public static void main(String[] args) {

        CalculatorMultiple cal= new CalculatorMultiple();
        int x=cal.mul(2,4,5);
        System.out.println("Multiplication of 3 num is: "+x);
    }
}
