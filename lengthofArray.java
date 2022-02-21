import java.util.Scanner;
public class lengthofArray {
  public static void main(String[] args) {
    // find length of array
    int a[] = new int[5];
    Scanner s = new Scanner(System.in);
    System.out.print("Enter length of array ");
    for (int i = 0; i < a.length; i++) {
      a[i] = s.nextInt();
    }
    System.out.println("Array elements ");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i] + " ");
    }
    System.out.println("Array length " + a.length);
  }
}
