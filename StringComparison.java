public class StringComparison {
   public static void main(String[] args) {
       // String comparison in java 
       String a ="Lion"; // string lateral
     //  String b = "Tiger";
       String b = new String("Lion"); // new keyword second method
      // if(a==b){ 
           if(a.equals(b)){
        System.out.println("True");
       }else{
        System.out.println("False");
       }
   } 
}
