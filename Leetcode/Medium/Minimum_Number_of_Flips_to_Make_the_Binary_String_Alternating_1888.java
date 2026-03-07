class Solution {
    public int minFlips(String str) {
        
        int len = str.length();
        String s=str+str;

        int left = 0 ;
        int diff1 = 0 ,diff2 = 0;

        int arr1[] = new int[len*2];
        int arr2[] = new int[len*2];

        for(int i = 0 ; i < len*2 ; i++ ){
            if(i % 2 == 0){
                arr1[i] = 0;
                arr2[i] = 1;
            }else{
                arr1[i] = 1;
                arr2[i] = 0;
            }
        }

        int changes = len;
        for( int right = 0 ; right < (len*2) ; right++){

            if((s.charAt(right) - '0') != arr1[right]) diff1++;
            
            if((s.charAt(right) - '0') != arr2[right]) diff2++;

            if((right - left +1 )>len){
                if((s.charAt(left) - '0') != arr1[left]) diff1--;
            
                if((s.charAt(left) - '0') != arr2[left]) diff2--;

                left++;
            }

            if((right-left+1)==len)changes = Math.min(changes , Math.min(diff1 , diff2));
        }
        return changes;
    }
}