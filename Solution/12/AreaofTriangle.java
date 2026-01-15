public class AreaofTriangle{
    public static double solution(double height, double base){
        return 0.5 * height * base;
    }
    public static double solution2(double a, double b, double c){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public static void main(String[] args) {
        int height = 10;
        int base = 5;
        System.out.println(solution(height, base));
        System.out.println(solution2(5,3,4));
    }
}