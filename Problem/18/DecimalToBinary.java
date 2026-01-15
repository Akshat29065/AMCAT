import java.util.*;

public class DecimalToBinary {

    public static int[] solution(int num){
        List<Integer> binary = new ArrayList<>();
        while(num > 0){
            int temp = num % 2;
            binary.add(temp);
            num = (int) num/2;
        }

        Collections.reverse(binary);

        int[] result = new int[binary.size()];

        for(int i = 0; i < binary.size(); i++){
            result[i] = binary.get(i);
        }
        return result;
    }

    public static String solution2(int num){
        if(num == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while(num > 0){
            sb.append(num%2);
            num = (int) num/2;
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int num = 23;
        System.out.println(Arrays.toString(solution(num)));
        System.out.println(solution2(2));
    }    
}
