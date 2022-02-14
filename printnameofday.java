import java.util.Scanner;

public class printnameofday {
    public static void main(String[] args) {
        // print name of day and enter code of day
        // input code(0 to 6)
        int weekend;
        System.out.print("Enter a number weekend ");
        Scanner s = new Scanner(System.in);
        weekend = s.nextInt();
        switch (weekend) {
            case 0:
                System.out.println("SUNDAY ");
                break;
            case 1:
                System.out.println("MONDAY ");
                break;
            case 2:
                System.out.println("TUESDAY ");
                break;
            case 3:
                System.out.println("WEDNESDAY ");
                break;
            case 4:
                System.out.println("THURSDAY ");
                break;
            case 5:
                System.out.println("FRIDAY ");
                break;
            case 6:
                System.out.println("SUNDAY ");
                break;
            default:
                System.out.println("INVALID CODE ");
                break;
        }
    }
}
