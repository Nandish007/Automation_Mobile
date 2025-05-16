package Conidtions;

public class Ifelseifcondition {
  public static void main(String[] args){

      int marks=95;

      if(marks<35)
      {
          System.out.println("Fail");
      }
      else if(marks>=35 && marks<45)
      {
          System.out.println("Just Pass");
      }
      else if (marks>=45 && marks<60)
      {
          System.out.println("Second Class");
      }
      else if (marks>=60 && marks<85)
      {
          System.out.println("First Class");
      }
      else if (marks>=85 && marks<=100)
      {
          System.out.println("Distinction");
      }
      else
      {
          System.out.println("Invalid marks");
      }

  }
}
