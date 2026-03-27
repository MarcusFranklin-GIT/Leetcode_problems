class Number_of_Substrings_With_Only_1s_1513 {
    public int numSub(String s) {
        long cnt=0,len=0;
        for(char ch : s.toCharArray()){
            if(ch=='0')len=0;
            else{
                len++;
                cnt+=len;
            }
        }
        int mod = 1000000007;
        return (int) (cnt % mod); 
    }
}