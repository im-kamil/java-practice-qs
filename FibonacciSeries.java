import java.util.Scanner;
public class FibonacciSeries {
   public static void main(String[] args) {
       // fibonacci series
       // 0 1 1 2 3 5 8 13 21 = add last two numbers is called fibonacci series
       int term, a=0, b=1, c;
       System.out.print("Enter any term ");
       Scanner s = new Scanner(System.in);
           term=s.nextInt();
       for(int i=1; i<=term; i++){
           System.out.print(a + " ");
           c=a+b;
           a=b;
           b=c;
       }
   } 
}
