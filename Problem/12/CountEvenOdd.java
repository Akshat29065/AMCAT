import java.util.Arrays;

public class CountEvenOdd {

    public static int[] solution(int[] arr){
        int odd = 0;
        int even = 0;

        for(int x : arr){
            if(x%2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        return new int[] {even, odd};
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(solution(arr)));
    }    
}
