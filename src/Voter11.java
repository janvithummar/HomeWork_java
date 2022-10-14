import java.util.Scanner;

public class Voter11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AGE...");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("Eligible for voting..");
        else
            System.out.println("not eligible for voting");
    }
}
