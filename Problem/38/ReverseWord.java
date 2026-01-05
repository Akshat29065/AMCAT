public class ReverseWord {

    public static String solution(String str){
        String[] words = str.split("\\s+");
        int n = words.length;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            char[] ch = words[i].toCharArray();
            reverse(ch);
            sb.append(ch);
            sb.append(" ");
        }
        return sb.toString();

    }
    public static String solution2(String str){
        String[] words = str.split("\\s+");
        int n = words.length;
        int left = 0; 
        int right = n - 1;

        while(left < right){
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", words);

    }




    public static void reverse(char[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        String str = "Hello my Name is Akshat";
        System.out.println(solution2(str));
    }    
}
