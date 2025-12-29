public class SecondMin {
    public static int solution(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            } else if(arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }
    public static void main(String[] args) {
        int[] arr = {1,54,23,32,5434,64,2,12,1};
        System.out.println(solution(arr));
    }
}
