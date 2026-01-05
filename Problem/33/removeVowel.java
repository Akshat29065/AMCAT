import java.util.*;

public class removeVowel {

    public static String solution(String str){
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int n = ch.length;

        for(int i = 0; i < n; i++){
            if(!vowels.contains(ch[i])){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
        String str = "Hello my name is Akshat";
        System.out.println(solution(str));
    }    
}
