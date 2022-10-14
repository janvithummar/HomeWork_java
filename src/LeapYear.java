import java.util.Scanner;

public class LeapYear {
    static int LeapYear;
    public static void main(String[] args){
        System.out.println("ENTER YEAR......");
        Scanner sc = new Scanner(System.in);
        LeapYear = sc.nextInt();
        if
        (((LeapYear % 3 == 0) &&(LeapYear % 100!= 0)) ||(LeapYear%400 == 0)){
            System.out.println("IT'S A LEAP YEAR.....");
        }
        else {
            System.out.println("IT'S  A NOT LEAP YEAR......");
        }
    }
}
