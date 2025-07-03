import java.util.*;

class Solution {
    public int minFlips(int[][] mat) {
        int diff[][] = { { 0, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        int R = mat.length, C = mat[0].length;
        int flag = 0;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == 1) {
                    flag |= 1 << ((i * C) + j);
                }
            }
        }
        queue.add(flag);
        visited.add(flag);
        int count = 0;
        while (!queue.isEmpty()) {
            int qsize = queue.size();
            for(int counter=0;counter<qsize;counter++){
                int cstate=queue.poll();
                if(cstate == 0) return count;
                for (int row = 0; row < R; row++) {
                    for (int col = 0; col < C; col++) {
                        int newstate=cstate;
                        for (int i = 0; i < 5; i++) {
                            int ar = row + diff[i][0], ac = col + diff[i][1];
                            if (ar >= 0 && ar < R && ac >= 0 && ac < C) {
                                newstate ^= (1 << ((ar * C) + ac));
                            
                                }
                            }
                            if (!visited.contains(newstate)) {
                                    queue.add(newstate);
                                    visited.add(newstate);
                        }
                    }
                }
            }
            count++;
        }
        return -1;
    }
}