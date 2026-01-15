public class GCD {
    public static int solution(int a, int b){
        int max = 1;
        int n = Math.min(a,b);
        for(int i = 1; i <= n; i++){
            if(a%i == 0 && b%i == 0){
                max = i;
            }
        }        
        return max;
    }
    public static int solution2(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 6;
        int b = 12;
        System.out.println(solution2(a,b));
    }
}
