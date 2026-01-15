public class matrixAdd {
    public static int[][] solution(int[][] A, int[][] B){
        int rows = A.length;
        int cols = A[0].length;

        int[][] result = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[][] A = {{1,2},{2,3},{3,4}};
        int[][] B = {{1,2},{2,3},{3,4}};

        int[][] C = solution(A,B);

        for(int i = 0; i < C.length; i++){
            System.out.println();
            for(int j = 0; j < C[0].length; j++){
                System.out.print(C[i][j] + " ");
            }
        }
    }    
}
