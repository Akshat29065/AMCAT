import java.util.Arrays;

public class MaxPro {

    public static int[] solution(int[] arr){
        int n = arr.length;
        int product = -1;
        int a = -1;
        int b = -1;
        for(int i = 0 ; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] * arr[j] > product){
                    product = arr[i] * arr[j];
                    a = i;
                    b = j;
                }
            }
        }
        return new int[] {product, a, b};
    }
    public static void main(String[] args){
        int[] arr = {1,234,43,5,45,423,1,12};
        System.out.println(Arrays.toString(solution(arr)));
    }
}