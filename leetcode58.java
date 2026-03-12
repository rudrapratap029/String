public class leetcode58 {
    public static void main(String[] args){
        String str = " Rudra Pratap Singh";
        int count = 0 ;
        int i = str.length()-1;
        while( i>= 0 && str.charAt(i) == ' '){
            i--;
        }

        while(i>= 0 && str.charAt(i)!= ' '){
            count++;
            i--;
        }
        System.out.println(count);
       

    }
    
}
