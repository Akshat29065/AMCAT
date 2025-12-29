public class MaxElement {
    public static int solution(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max) max = arr[i]; 
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {2,3,5,6,7,32,4,1};
        System.out.println(solution(arr));
    }
} 