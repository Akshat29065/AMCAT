public class ReverseStr {

    public static String solution(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        int left = 0;
        int right = n -1;

        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        return new String(ch);
        

    }
    public static void main(String[] args) {
        String str = "Akshat";
        System.out.println(solution(str));
    }    
}
