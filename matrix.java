import java.util.*;

public class matrix {
    public static void main(String[] args){
        int matrix[][] = new int[6][6];
        for(int i = 0;i < 6;i++){
            for(int j = 0;j < 6;j++){
                matrix[i][j] = (int)((Math.random() * 5) % 2);
            }
        }
    }
    public static void displayMatrix(int[][] matrix) {
        System.out.print("\nMatrix Values \n");
        for (int i = 0; i < 6; i++) {
          for (int j = 0; j < 6; j++) {
            System.out.print(matrix[i][j] + " ");
          }
          System.out.println();
        }
      }
    
}
