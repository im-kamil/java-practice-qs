public class starpatternprogram {
    public static void main(String[] args) {
        // star pattern program
        int i, j, k;
        /*
         * for(i=1; i<=5; i++){ // rows
         * for(j=1; j<=i; j++){ // columns
         * System.out.print("*");
         * }
         * System.out.print("\n");
         * }
         */
        /*
         * for(i=5; i>=1; i--){ // rows
         * for(j=1; j<=i; j++){ // columns
         * System.out.print("*");
         * }
         * System.out.print("\n");
         * }
         */
       /* for (i = 1; i <= 5; i++) { // rows
            for (j = i; j < 5; j++) { // space
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) { // columns
                System.out.print("*");
            }

            System.out.print("\n");
        }  */
        for (i = 1; i <= 5; i++) { // rows
            for (j = 1; j < i; j++) { // space
                System.out.print(" ");
            }
            for (k = i; k <= 5; k++) { // columns
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
