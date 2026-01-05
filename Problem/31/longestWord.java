public class longestWord {

    public static String solution(String str){
        String[] arr = str.split("[^a-zA-Z]+");
        int max = arr[0].length();
        String longest = arr[0];
        for(String i : arr){
            if(i.length() > max){
                max = i.length();
                longest = i;
            }
        }
        return longest;        
    }
    public static void main(String[] args) {
        String str = "Hello,,,, My name is Akshat";
        System.out.println(solution(str));
    }    
}
