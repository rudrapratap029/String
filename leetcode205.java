public class leetcode205 {

    public static void main(String[] args) {
        String s = "add";
        String t = "ego";

        int map1[] = new int[256];
        int map2[] = new int[256];
        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map1[c1] != map2[c2]){
                System.out.println("false");
                return;

            }
            map1[c1] = i+1;
            map2[c2] = i+1;
        }

        System.out.println("true");

    }

}
