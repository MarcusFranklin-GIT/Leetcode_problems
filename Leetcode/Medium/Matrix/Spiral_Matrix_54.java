import java.util.*;
public class Spiral_Matrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;

        int top=0;
        int bottom = R-1;

        int left=0;
        int right=C-1;

        List<Integer> result = new LinkedList<>();

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            for(int i=top; i<=bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right ; i>=left ; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom ; i>=top ;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return result;
    }
}