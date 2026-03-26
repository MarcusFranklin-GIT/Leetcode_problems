public class Minimum_Bit_Flips_to_Convert_Number_2220 {
    public int minBitFlips(int start, int goal) {
        int ans= start^goal;
        int cnt=0;
        while(ans != 0){
            ans&=(ans-1);
            cnt++;
        }
        return cnt;
    }
}