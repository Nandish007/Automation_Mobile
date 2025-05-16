package Branch_Push;

public class CalculatorAddition {

    public void add(int x,int y){
        int sum=x+y;
        System.out.println("Sum of two number is: "+sum);
    }

    public static void main(String[] args) {

        CalculatorAddition cal=new CalculatorAddition();
        cal.add(220,300);
    }
}
