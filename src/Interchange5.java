import java.util.Scanner;

public class Interchange5 {
    public static void main(String[] args)
    {
        int x,y,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALUE X and Y.....");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("before swipe number--"+x+" "+y);
        t = x;
       x = y;
       y = t;
        System.out.println("after swipe--"+x+" "+y);
        System.out.println();
    }
}
