import java.util.Scanner;

public class Symbol13 {
    public static void main(String[] args){
        double num1,num2;
        char symbol;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NUMBER 1......");
        num1 = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("ENTER NUMBER 2.....");
        num2 = scanner.nextDouble();
        System.out.println("ENTER SYMBOL(+,-,/): ");
        symbol = scanner.next().charAt(0);
        scanner.close();
        System.out.println(num1+ " "+symbol+" "+num2+" =" );
        switch (symbol)
        //using switch case
        {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1+num2);
                break;
            case '*':
                System.out.println(num1+num2);
                break;
            case '/':
                System.out.println(num1+num2);
                break;
            default:
                System.out.println("Ooops....INVALID SYMBOL");
                break;


        }
        return;
    }



}
