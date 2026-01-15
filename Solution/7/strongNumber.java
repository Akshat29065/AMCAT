public class strongNumber {

    public static boolean solution(int n){
        int sum = 0;
        int temp = n;
        while(temp > 0){
            int a = temp % 10;
            sum += factorial(a);
            temp /= 10;
        }

        if(sum == n) return true;
        return false;
    }

    public static int factorial(int n){
        if(n < 0) return -1;
        if(n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 145;
        System.out.println(solution(n));
    }    
}
