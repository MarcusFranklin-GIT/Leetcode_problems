package Leetcode.Medium.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Flood_Fill_733 {
    int diff[][] = {{0,1},{1,0},{-1,0},{0,-1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        if(image[sr][sc]==newColor) return image;

        int R = image.length;
        int C = image[0].length;

        int initial_color = image[sr][sc]; 
        
        Queue<int[]> Q = new LinkedList<>();
        Q.add(new int[]{sr,sc});
        image[sr][sc] = newColor;

        while(!Q.isEmpty()){
            int curr[] = Q.poll();
            int r = curr[0];
            int c = curr[1];

            for(int dir[] : diff){
                int adjR = r + dir[0];
                int adjC = c + dir[1];
                if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && image[adjR][adjC]==initial_color){
                    image[adjR][adjC] = newColor;
                    Q.add(new int[]{adjR,adjC});
                }
            }
        }

        return image;
    }
}
