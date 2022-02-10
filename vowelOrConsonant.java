import java.util.Scanner;
public class vowelOrConsonant {
    public static void main(String[] args) {
        // vowel or consonant in java 
       // input  a e i o u --> vowel 
       // input remain consonant
       char ch;
       System.out.println("Enter a character");
       Scanner s =new Scanner(System.in);
         ch = s.next().charAt(0);
         if(ch='a' || ch='e' || ch='i' || ch='o' || ch='u'){
            System.out.println("vowels");
         }
         else{
            System.out.println("Consonant");
         }
    }
}
