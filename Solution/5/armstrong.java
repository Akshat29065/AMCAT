

public class armstrong {
    public static boolean solution(int n){
        int count = 0;
        int sum = 0;
        int t1 = n;
        while(t1 > 0){
            t1 /= 10;
            count++;
        }

        int t2 = n;
        while(t2 > 0){
            int a = t2%10;
            sum += Math.pow(a,count);
            t2 /= 10;
        }

        if(n == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(solution(n));
    }    
}
