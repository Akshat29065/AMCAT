public class anagram {

    public static boolean solution(String s, String t){

        if(s.length() != t.length()) return false;
        int[] freq = new int[26];

        for(char x : s.toCharArray()){
            freq[x - 'a']++;
        }

        for(char x : t.toCharArray()){
            freq[x - 'a']--;
        }

        for(int x : freq){
            if(x != 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(solution(s,t));
    }
}