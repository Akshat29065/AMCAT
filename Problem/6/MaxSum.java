import java.util.Arrays;

public class MaxSum {
    public static int[] solution(int[] arr){
        int n = arr.length;
        int sum = Integer.MIN_VALUE;
        int a = -1;
        int b = -1;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] > sum) {
                    sum = arr[i] + arr[j];
                    a = i;
                    b = j;
                }
            }
        }

        return new int[] {sum, a, b};

    }

    public static int[] solution2(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int maxidx = -1;
        int secondMaxidx = -1;

        for(int i = 0; i < n ; i++){
            if(arr[i] > max){
                secondMax = max;
                secondMaxidx = maxidx;
                max = arr[i];
                maxidx = i;
            } else if (arr[i] > secondMax && i != maxidx){
                secondMax = arr[i];
                secondMaxidx = i;
            }
        }

        return new int[] {max + secondMax, maxidx, secondMaxidx};

    }
    public static void main(String[] args) {
        int[] arr = {11,23,43,231,213,24,12,423};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution2(arr)));
    }    
}
