import java.util.Arrays;

public class RotatebyKLeft {

    public static int[] solution(int[] arr, int k){
        int n = arr.length; 

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        return arr;
    }

    public static void reverse(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }        
    }
    public static void main(String[] args) {
        int k = 2;
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(solution(arr, k)));
    }
}
