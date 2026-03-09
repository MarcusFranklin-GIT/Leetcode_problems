public class Spiral_Matrix_II_59 {
    public int[][] generateMatrix(int n) {
        int [][] ans=new int [n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int num=0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                num++;
                ans[top][i]=num;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                num++;
                ans[i][right]=num;
            }
            right--;
            for(int i=right;i>=left;i--){
                num++;
                ans[bottom][i]=num;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                num++;
                ans[i][left]=num;
            }
            left++;
        }
        return ans;
    }
}