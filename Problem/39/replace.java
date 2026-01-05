import java.util.*;

public class replace {

    public static String solution(String str, char what, char with){
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == what){
                ch[i] = with;
            }
        }

        return new String(ch);

    }
    public static String solution2(String str, char what, char with){
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == what){
                ch[i] = with;
                break;
            }
        }
        return new String(ch);
    }
    public static String solution3(String str, char what, char with){
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(!Character.isAlphabetic(ch[i])){
                ch[i] = with;
            }
        }
        return new String(ch);
    }

    

    public static void main(String[] args) {
        String str = "ab1c2d3";
        char what = 'a';
        char with = '*';
        System.out.println(solution3(str, what, with));
    }    
}
