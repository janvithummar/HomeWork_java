import java.util.Scanner;

public class Commission9
{
double salesamount, salary; //use globle variable
    int id;
    String name;
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);

        System.out.println("ENTER SALES ID...");
        int id=scanner.nextInt();

        System.out.println("ENTER SALLER NAME...");
        String name = scanner.next();
        System.out.println("ENTER SALES AMOUNT..");
        double salesamount = scanner.nextDouble();
        if (salesamount >= 50000)
        {
            System.out.println("seller commision is 35%");
        }
        else if (salesamount >=30000)
        {
            System.out.println("seller commision is 20%");
        }
        else if (salesamount >=20000)
        {
            System.out.println("seller commision is 10%");
        }
        else if (salesamount >=10000)
           {
               System.out.println("seller commision 5%");

        } else if (salesamount >=10000)
        {
            System.out.println("seller commision is 2%");
        }
        else
        {
            System.out.println(" no seller commision ");
        }
    }
}
