import java.util.Scanner;

public class PositiveValue8
{
   public static void main(String []args){
       int num;
       //variable inside the main method
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your number:   ");
       int number = scanner.nextInt();
       //check the condition for positive, negative,zero
       if(number>0)
       {
           System.out.println("THE GIVEN NUMBER " +number+ "........is positive number");
       }
        else if (number<0)
        {
           System.out.println("THE GIVEN NUMBER" +number+ " .....is negative number");
       }
       else  {
           System.out.println("IT'S ZERO");
       }
   }
}
