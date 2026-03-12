public class leetcode28 {

    public static void main(String[] args) {
        String haystack = "RudraPratapSingh";
        String needle = "Pr";

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                System.out.println(i);
                return;
            }

        }

        System.out.println(-1);

    }

}
