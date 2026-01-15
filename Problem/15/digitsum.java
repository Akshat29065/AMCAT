public class digitsum {
    public static int solution(int num){
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }

    public static int sol(int n){
        while(n >= 10){
            int sum = 0;
            while(n > 0){
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
    public static void main(String[] args) {
        int num = 38;
        System.out.println(sol(num));
    }
}
