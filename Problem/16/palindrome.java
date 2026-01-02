public class palindrome {

    public static boolean solution(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n -1;
        while(left < right){
            if(arr[left] == arr[right]){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean solution(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        int left = 0;
        int right = n -1;
        while(left < right){
            if(ch[left] == ch[right]){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,1};
        String str = "abacaba";
        System.out.println(solution(arr));
        System.out.println(solution(str));
    }
}
