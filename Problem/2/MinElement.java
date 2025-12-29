public class MinElement {

    public static int solution(int[] arr){
        int n = arr.length;
        int min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,43,45,231,0,4,2};
        System.out.println(solution(arr));
    }
}
