package Leetcode.Easy;
class Find_Closest_Person_3516 {
    public int findClosest(int x, int y, int z) {
        int d1=Math.abs(x-z);
        int d2=Math.abs(y-z);
        if(d1==d2)return 0;
        if(d1<d2)return 1;
        return 2;
    }
}