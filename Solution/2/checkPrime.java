public class checkPrime{
    public static boolean solution(int n){
        if ( n < 2){
            return false;
        }                
        for(int i = 2; i * i <= n; i++){
            if(i%n == 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int n = 41;
        System.out.println(solution(n));
    }
}