import java.util.Scanner;

public class CityName
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER ANY A TO F ALPHABET...");
        String City = input.nextLine();
        //switch statement to check message
        switch (City)
        {
            case "A":
                System.out.println("AMERICA");
                break;
            case "B":
                System.out.println("brazil");
                break;
            case "C":
                System.out.println("chennai");
                break;

            case "D":
                System.out.println("dubai");
                break;
            case "E":
                System.out.println("europe");
                break;
            case "F":
                System.out.println("franc");
                break;
            default:
                System.out.println("sorry....city is not find");
                break;
        }

    }
}
