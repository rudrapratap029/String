public class leetcode125 {



    public static boolean isPalindrome(String s) {

        // Convert to lowercase
        s = s.toLowerCase();

        // Remove non-alphanumeric characters
        String clean = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                clean += ch;
            }
        }

        // Check palindrome
        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println(result);
    }
}
    

