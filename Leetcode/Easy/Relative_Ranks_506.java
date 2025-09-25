package Leetcode.Easy;

class Relative_Ranks_506 {
    public String[] findRelativeRanks(int[] score) {
        int max=0;
        for(int i:score){
            max=Math.max(max,i);
        }
        int fre[]=new int[max+1];
        for(int i=0;i<score.length;i++){
            fre[score[i]]=i+1;
        }
        String res[] = new String[score.length];
        int rank = 1;
        for (int i = fre.length - 1; i >= 0; i--) {
            if (fre[i] != 0) {
                int originalIndex = fre[i] - 1;
                if (rank == 1) {
                    res[originalIndex] = "Gold Medal";
                } else if (rank == 2) {
                    res[originalIndex] = "Silver Medal";
                } else if (rank == 3) {
                    res[originalIndex] = "Bronze Medal";
                } else {
                    res[originalIndex] = Integer.toString(rank);
                }
                rank++;
            }
            if (rank > res.length) {
                break;
            }
        }
        return res;
    }
}