public class LCM {
    public static int solution(int a, int b){
        return (a*b) / gcd(a,b);
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 6, b = 12;
        System.out.println(solution(a,b));
    }
}
