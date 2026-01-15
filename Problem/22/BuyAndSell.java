public class BuyAndSell {
    public static int solution(int[] arr){
        int minprice = arr[0];
        int profit = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < minprice){
                minprice = arr[i];
            } else{
                profit = Math.max(profit, arr[i] - minprice);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(solution(arr));
    }    
}