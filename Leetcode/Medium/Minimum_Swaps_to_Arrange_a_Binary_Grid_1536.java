public class Minimum_Swaps_to_Arrange_a_Binary_Grid_1536 {
    public int minSwaps(int[][] grid) {
        int R=grid.length;

        int trailing[]=new int[R];

        for(int i=0;i<R;i++){
            for(int j=R-1;j>=0;j--){
                if(grid[i][j]==0)trailing[i]++;
                else break;
            }
        }

        int swaps=0;

        for(int i=0;i<R;i++){
            int required=R-i-1;

            int j=i;
            while(j<R && trailing[j]<required){
                j++;
            }

            if(j==R)return -1;

            while(j>i){
                int temp=trailing[j];
                trailing[j]=trailing[j-1];
                trailing[j-1]=temp;
                j--;
                swaps++;
            }
        }
        return swaps;
    }
}