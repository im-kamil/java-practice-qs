public class StringMethods {
    public static void main(String[] args) {
        // String methods
        String a = "KAMIL";
        String b = "iram";
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());
        String c = "    FAZAL    ";
        String d = "";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('k'));

        System.out.println(b.equals(a));
        System.out.println(d.replace('f', 'a'));
      
    }
}
