public class kadane {

    public static int solution(int[] arr){
        int cursum = arr[0];
        int best = arr[0];
        for(int i = 0; i < arr.length; i++){
            cursum = Math.max(arr[i], cursum + arr[i]);
            best = Math.max(best, cursum);
        }
        return best;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution(arr));
    }

}
