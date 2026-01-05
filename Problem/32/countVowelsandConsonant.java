import java.util.*;

public class countVowelsandConsonant {

    public static int[] solution(String str){
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int v = 0;
        int c = 0;

        for(char i: str.toLowerCase().toCharArray()){
            if(Character.isLetter(i)){
                if(vowels.contains(i)){
                    v++;
                } else {
                    c++;
                }
            }
        }
        return new int[] {v,c};
    }
    public static void main(String[] args) {
        String str = "AeiouBCdfg123!";
        System.out.println(Arrays.toString(solution(str)));

    }
    
}
