import java.util.*;

public class FirstNonRepeating {

    public static char solution(String str){
        HashMap<Character, Integer> count = new HashMap<>();
        char[] ch  = str.toCharArray();
        int n = ch.length;
        for(int i = 0; i < n; i++){
            count.put(ch[i], count.getOrDefault(ch[i], 0) + 1);
        }
        
        for(int i = 0; i < n; i++){
            if(count.get(ch[i]) == 1){
                return ch[i];
            }
        }

        return '\0';
    }   
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(solution(str));
    }
}
