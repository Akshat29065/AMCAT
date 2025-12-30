import java.util.Arrays;

public class MaxPro {

    public static int[] solution(int[] arr){
        int n = arr.length;
        int product = Integer.MIN_VALUE;
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

    public static int[] solution2(int[] arr){
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int maxidx = -1;
        int secondMax = Integer.MIN_VALUE;
        int secondMaxidx = -1;

        int min = Integer.MAX_VALUE;
        int minidx = -1;
        int secondMin = Integer.MAX_VALUE;
        int secondMinidx = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                secondMax = max;
                secondMaxidx = maxidx;
                max = arr[i];
                maxidx = i;
            } else if(arr[i] > secondMax && i != maxidx){
                secondMax = arr[i];
                secondMaxidx = i;
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                secondMin = min;
                secondMinidx = minidx;
                min = arr[i];
                minidx = i;
            } else if(arr[i] < secondMin && i != minidx){
                secondMin = arr[i];
                secondMinidx = i;
            }
        }
        int product1 = max * secondMax;
        int product2 = min * secondMin;

        if(product1 > product2){
            return new int[] {product1, maxidx, secondMaxidx};
        } else {
            return new int[] {product2, minidx, secondMinidx};
        }
    }
    public static void main(String[] args){
        int[] arr = {1,234,43,5,45,423,1,12};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution2(arr)));
    }
}