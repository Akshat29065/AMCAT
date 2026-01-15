import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {

    public static int[] solution(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+ 1);
        }

        int maxFrequency = Integer.MIN_VALUE;
        int element = -1;

       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                element = entry.getKey();
            }
        }

        return new int[] {element ,maxFrequency};

    }
    public static void main(String[] args) {        
        int[] arr = {1,1,2,2,3,4,3,12,21,1,1,2};
        System.out.println(Arrays.toString(solution(arr)));
    }    
}
