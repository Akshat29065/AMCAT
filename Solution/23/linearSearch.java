public class linearSearch {
    public static int solution(int[] arr, int a){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == a){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int a = 3;
        System.out.println(solution(arr, a));
    }    
}
