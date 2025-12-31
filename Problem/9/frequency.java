import java.util.HashMap;

public class frequency {

    public static HashMap<Integer, Integer> solution(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return map;
    }

    public static HashMap<Character, Integer> solution(char[] arr){
        int n = arr.length;
        HashMap<Character, Integer> map = new HashMap();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        return map;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,2,3,4,5,6};
        String str = "akshat";
        char[] ch = str.toCharArray();
        System.out.println(solution(ch));
        System.out.println(solution(arr));
    }
}
