import java.util.Scanner;

public class DayName
{
    static int number=10;
    public  static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ENTER WEEKDAY NUMBER....");
        int WeekDay = scanner.nextInt();
        switch (WeekDay)
        {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUSEDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRYDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
            default:
                System.out.println("WROMG DAYS ENTERED:.."+WeekDay);
                break;

        }
    }
}
