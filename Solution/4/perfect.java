public class perfect {
    public static boolean solution(int n){
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n) return true;

        return false;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(solution(n));
    }
}
