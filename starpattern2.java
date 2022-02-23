public class starpattern2 {
    public static void main(String[] args) {
        // java star pattern part 2
        int i, j;
        for (i = 1; i <= 5; i++) { // rows
            for (j = 1; j <= 5; j++) { // columns
                if (i == 1 || i == 5 || j == 1 || j == 5) // logic of star disappear
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.print("\n");
        }
    }
}
