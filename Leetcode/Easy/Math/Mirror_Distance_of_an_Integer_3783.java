public class Mirror_Distance_of_an_Integer_3783 {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    private int reverse(int num){
        int res=0;
        while(num>0){
            res*=10;
            res+=num%10;
            num/=10;
        }
        return res;
    }
}
