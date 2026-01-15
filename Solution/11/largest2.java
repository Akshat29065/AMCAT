public class largest2 {
    public static int solution(int a, int b){
        return (a + b + Math.abs(a-b))/2;
    }
    public static void main(String[] args) {
        int a = 60, b = 30;
        System.out.println(solution(a,b));
    }    
}
