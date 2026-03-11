public class InterningNew {
    public static void main(String[] args) {

        String s1 = new String("Rudra");
        String s2 = new String("Rudra");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        String s3 = "Rudra";
        String s4 = "Rudra";
        System.out.println(s3 == s4); // true
    }

}
