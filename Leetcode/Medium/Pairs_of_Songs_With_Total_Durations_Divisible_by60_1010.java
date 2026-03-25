public class Pairs_of_Songs_With_Total_Durations_Divisible_by60_1010 {
    public int numPairsDivisibleBy60(int[] time) {
        int freq[] = new int[60];
        int cnt=0;
        for(int num:time){
            int rem = num%60;
            cnt+=freq[(60-rem)%60];
            freq[rem]++;
        }
        return cnt;
    }
}