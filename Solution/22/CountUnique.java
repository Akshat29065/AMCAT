import java.util.*;

public class CountUnique {
    public static int solution(int[] arr){
        int n = arr.length;
        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
    public static int[] solution2(int[] arr){
        Set<Integer> seen = new HashSet<>();
        List<Integer> unique = new ArrayList<>();
        for(int i : arr){
            if(!seen.contains(i)){
                seen.add(i);
                unique.add(i);
            }
        }
        int[] res = new int[unique.size()];
        for(int i = 0 ; i < unique.size(); i++){
            res[i] = unique.get(i);
        }

        return res;
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,4,5};
        System.out.println(Arrays.toString(solution2(arr)));
        System.out.println(solution(arr));
    }
}