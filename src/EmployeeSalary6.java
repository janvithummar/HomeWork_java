import java.util.Scanner;

public class EmployeeSalary6 {
        double basicsalary,hra,da,ta,pf,gross;//declare globle variable
        int id;
        String name;
        public void print(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ENTER EMPLOYEE NAME .....");
            name= scanner.nextLine();
            System.out.println("ENTER EMPLOYEE ID:....");
            id=scanner.nextInt();
            System.out.println("ENTER EMPLOYEE SALARY :.....");
            basicsalary=scanner.nextInt();

        }
        public void count() //counting all parameters
        {
            hra=basicsalary*10/100;
            da=basicsalary*8/100;
            ta=basicsalary*9/100;
            pf=basicsalary*20/100;
            gross=basicsalary+hra+da+ta-pf;

        }
        public void dislpay() // display all parameters calculate
        {
            count();
            System.out.println("HRA=  "+hra);
            System.out.println("DA=  "+da);
            System.out.println("TA=  "+ta);
            System.out.println("PF=  "+pf);
            System.out.println("gross salary=  "+gross+ "&\tHRA= "+hra+ "&\tDA= "+da+ "&\tTA="+ta+ "&\tPF="+pf);


        }
        public static void main(String[] args)
        {
            EmployeeSalary6 employeeSalary6 = new EmployeeSalary6();
            employeeSalary6.print();
            employeeSalary6.count();
            employeeSalary6.dislpay();

        }

    }

