import java.util.Arrays;

public class Cookies {

    public static int solution(int[] g, int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0;
        int j = 0;
        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(solution(g, s));
    }
}