
import java.util.*;

public class sumofDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int sum=0;
        int ld;

        while(n!=0){
          
          ld=n%10; 
          sum+=ld;
          n=n/10;

        }

        System.out.println(sum);
        sc.close();
    }
}