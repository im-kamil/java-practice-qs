import java.util.Scanner;

public class leapyearprogram {
    public static void main(String[] args) {
        // leap year program
        // 1. century (100%=0 and 400%=0) 2000 2400
        // 2.yearly (100%!=0 and 4%=0) 2020 2024
        int y;
        System.out.print("Enter a year ");
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
        if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println("LEAP YEAR ");
        } else {
            System.out.println(" NOT LEAP YEAR ");
        }
    }
}
