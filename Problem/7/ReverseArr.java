import java.util.Arrays;

public class ReverseArr {

    public static int[] solution(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(arr)));
    }    
}
