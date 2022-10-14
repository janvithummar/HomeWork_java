import java.util.Scanner;

public class OddEven {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number.....");
        int number = scan.nextInt();
        scan.close();
        String result = number%2==0 ? "Even" : "Odd"; //ternary operator check the number
        System.out.println(number +" number is "+ result);
    }
}
