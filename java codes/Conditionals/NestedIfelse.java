import java.util.Scanner;
public class NestedIfelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st no :");
        int a=sc.nextInt();
        System.out.print("Enter 2nd no :");
        int b=sc.nextInt();
        System.out.print("Enter 3rd no :");
        int c=sc.nextInt();

        if(a>b) 
        {
            if(a>c) System.out.println(a+ " is greatest");
            else //c>=a>b
            System.out.println(c+ " is greatest");
        }
        else // b>a
        {
            if(b>c) System.out.println(+b+" is greatest");
            else //c>=b>=a
            System.out.println(c+ " is greatest");

        }
        sc.close();
    }
}
