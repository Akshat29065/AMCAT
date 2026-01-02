public class BinaryToDecimal {

    public static int solution(int num){
        int result = 0;
        int base = 1;

        while(num > 0){
            int bit = num%10;
            result += bit * base;
            base *= 2;
            num = num / 10;
        }
        
        return result;
    }
    public static void main(String[] args) {
        int num = 1101;
        System.out.println(solution(num));
    }    
}
