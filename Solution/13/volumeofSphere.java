public class volumeofSphere {
    public static double solution(int r){
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }
    public static void main(String[] args) {
        int radius = 2;
        System.out.println(solution(radius));
    }    
}
