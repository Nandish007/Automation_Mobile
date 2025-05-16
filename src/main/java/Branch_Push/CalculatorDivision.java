package Branch_Push;

public class CalculatorDivision {

    public int div(int x,int y)
    {
          int sum=x/y;
          return sum;
    }

    public float div(int x,float y,float z)
    {
        float sum=x/y+z;
        return sum;
    }
    public static void main(String[] args) {

        CalculatorDivision Cal=new CalculatorDivision();
         int x=Cal.div(5,2);
         float y=Cal.div(20,2.50f,2.50f)  ;
         System.out.println(x);
        System.out.println(y);

    }
}