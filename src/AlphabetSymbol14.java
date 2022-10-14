import java.util.Scanner;

public class AlphabetSymbol14 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ANY CHARECTER...");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z' ))
        {
            System.out.println(ch + " is a alphabet.");

        } else if (ch >= '0' && ch <= '9')
        {
            System.out.println(ch + "is number");
        }
        else
        {
            System.out.println(ch + "is a special symbol");
        }
    }
}
