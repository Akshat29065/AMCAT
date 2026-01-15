import java.util.*;
public class SecondMax {

    public static int solution(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static int solution2(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,435,63,32,12,4};
        System.out.println(solution(arr));
        System.out.println(solution2(arr));
    }
}