import java.util.Arrays;

public class arrayElementsusingArrayclass {
    public static void main(String[] args) {
        // toString() asList() deepToString()
        String a[] = { "learn", "coding", "keypoints", "Education" };
        System.out.println("toString() " + Arrays.toString(a));
        System.out.println("asList() " + Arrays.asList(a));
        int arr[][] = { { 10, 20 }, { 20, 30 } };
        System.out.println("deepToString() " + Arrays.deepToString(arr));

    }
}
