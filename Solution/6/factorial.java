public class factorial {
    public static int solution(int n){
        int result = 1;
        if(n <= 1){
            return result;
        }
        for(int i = 2; i <= n; i++){
            result *=  i;
        }
        return result;
    }

    public static int solution2(int n){
        if( n < 0) return -1;
        if( n <= 1) return 1;
        return n * solution2(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution2(n));
    }    
}
