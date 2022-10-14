import java.util.Scanner;

public class AverageNumber7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("1st number....");
        int num1 = in.nextInt();
        System.out.println("2nd number....");
        int num2 = in.nextInt();
        System.out.println("3rd number....");
        int num3 = in.nextInt();
        System.out.println("4th number.....");
        int num4 = in.nextInt();
        System.out.println("5th number...");
        int num5 = in.nextInt();
        System.out.println("AVERAGE OF FIVE NUMBER..: " + (num1 + num2 + num3 + num4 + num5) / 5);
    }
}
