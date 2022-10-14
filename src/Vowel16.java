import java.util.Scanner;

public class Vowel16 {
    public static void main(String[] arg)
    {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER CHARECTER..");
        char ch=sc.next().charAt(0);
        if (ch=='a'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='0'||ch=='U')
        {
            System.out.println("Enter Charecter "+ch+" ...IS VOWEL");

        } else if ((ch>='a'&&ch<='z')||(ch>='A'&& ch<='Z'))
            System.out.println("ENTER CHARECTER "+ch+ "..IS CONSONANT");
        else
            System.out.println("not an alphabet");
    }
    }
