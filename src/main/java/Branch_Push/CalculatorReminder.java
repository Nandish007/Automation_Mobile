package Branch_Push;

public class CalculatorReminder {

    public void A(int x,int y)
        {
            int sum=x%y;
            System.out.println("The Reminder is: "+sum);
        }
        public int B(int x,int y)
        {
            int sum=(x%y)+2;
            return sum;
        }

    public static void main(String[] args) {

        CalculatorReminder R=new CalculatorReminder();
        R.A(3,2);
        int x=R.B(15,3);
        System.out.println("The Reminder is: "+x);
    }
}
