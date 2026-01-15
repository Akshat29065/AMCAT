public class SumofDigits {
    public static int solution(int n){
        while(n >= 10){
            int sum = 0;
            while( n > 0){
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args) {
        int n = 33;
        System.out.println(solution(n));
    }    
}
