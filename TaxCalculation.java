import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        // print tax calculation program
        // input salary 10000----> no tax
        // input salary >=10000 between <=100000 ----> 10%tax
        // input salary 2000000-----> 20%tax
        int salary;
        double tax;
        System.out.print("Enter your salary ");
        Scanner s = new Scanner(System.in);
        salary = s.nextInt();
        if (salary <= 10000) {
            System.out.print(salary + " no tax ");
        } else if (salary > 10000 && salary <= 100000) {
            tax = salary * 0.10;
            System.out.print(salary + " " + tax);
        } else {
            tax = salary * 0.20;
            System.out.print(salary + " " + tax);
        }
    }
}
