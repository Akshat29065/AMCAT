import java.util.*;

public class RemoveDuplicates {

    public static int[] solution(int[] arr){
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(!seen.contains(arr[i])){
                seen.add(arr[i]);
                result.add(arr[i]);
            }
        }

        int[] res = new int[result.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,4,5,7,8,8};
        System.out.println(Arrays.toString(solution(arr)));
    }    
}
