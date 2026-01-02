public class Amrstrong {

    public static boolean solution(int num){

        if(num >= 0 && num <= 9) return true;

        int count = 0;
        int temp = num;

        while(temp > 0){
            temp = temp / 10;
            count++;
        }

        int sum = 0;
        int temp2 = num;
        
        while(temp2 > 0){
            sum += (int) Math.pow(temp2%10, count);
            temp2 /= 10;
        }
        
        return sum == num;
    }
    public static void main(String[] args) {
        int num = 153;
        System.out.println(solution(num));
    }
}