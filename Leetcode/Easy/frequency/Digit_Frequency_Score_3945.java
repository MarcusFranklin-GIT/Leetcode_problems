
public class Digit_Frequency_Score_3945 {
    public int digitFrequencyScore(int n) {
        int fre[] = new int[10];
        while(n>0){
            fre[n%10]++;
            n/=10;
        }
        int sum=0;
        for(int i =1 ; i<=9 ; i++){
            sum+=fre[i]*i;
        }
        return sum;
    }
}
