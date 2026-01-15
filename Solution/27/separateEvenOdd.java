import java.util.Arrays;

public class separateEvenOdd {
    public static int[] solution(int[] arr){
        
        int[] result = new int[arr.length];
        int index = 0;

        for(int i : arr){
            if(i%2 == 0){
                result[index++] = i;
            }
        }

        for(int i : arr){
            if(i%2 != 0){
                result[index++] = i;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(solution(arr)));
    }    
}
