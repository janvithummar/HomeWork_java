import java.util.Scanner;

public class StudentResult {
    static String name;
    static  int Roll_No;
    static double total;
    static  double percentage;
    static double eng,math,sci;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("ENTER STUDENT NAME ..>\t");
        name = scanner.next();
        System.out.println("ENTER ROLL NO....>\t");
        Roll_No = scanner.nextInt();
        System.out.println("ENTER ENGLISH MARKS....>\t");
        eng = scanner.nextDouble();
        System.out.println("ENTER MATHS MARKS...>\t");
        math = scanner.nextDouble();
        System.out.println("ENTER SCIENCE");
        sci = scanner.nextDouble();

        double total =eng+math+sci;
        double percentage = total/3;
        System.out.println(name + "\tRoll_No..\t" + Roll_No + "\tTotal_Marks\t\t" + total + "\tpercentage\t\t" + percentage + "%");
        if (eng < 35 || math < 35 || sci < 35)
        {
            System.out.println("YOU ARE FAIL");
        }
        else
        if (percentage >= 80)
        {
            System.out.println("A+ Gread...");
        }
        else if (percentage >= 60)
        {
            System.out.println("A Gread...");
        } else if (percentage >= 50)
        {
            System.out.println("B Gread...");
        }
        else if (percentage >= 35)
        {
            System.out.println(" C Gread");
        }
        else
        {
            System.out.println("YOU ARE FAIL.");
        }

    }


}
