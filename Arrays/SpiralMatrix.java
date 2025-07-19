import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
     public static  List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> matrix2=new ArrayList<>();
        int rowStart= 0; int rowEnd=  matrix.length-1;
        int colStart= 0; int colEnd= matrix[0].length-1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            
            for(int col = colStart; col <= colEnd; col++){
                matrix2.add(matrix[rowStart][col]);
            }
            rowStart++;
            for(int row = rowStart; row <= rowEnd; row++){
                matrix2.add(matrix[row][colEnd]);
            }
           colEnd--;
           if(rowStart<=rowEnd){
            for(int col = colEnd; col >= colStart; col--){
                matrix2.add(matrix[rowEnd][col]);
            }
            rowEnd--;
           }
           if(colStart<=colEnd){
            for(int row = rowEnd; row >= rowStart; row--){
                matrix2.add(matrix[row][colStart]);
            }
            colStart++;
           }
        }
        return matrix2;
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
