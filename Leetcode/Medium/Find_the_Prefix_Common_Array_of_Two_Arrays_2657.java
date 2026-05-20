public class Find_the_Prefix_Common_Array_of_Two_Arrays_2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int res[]= new int[len];
        int fre[] = new int[len+1];
        int count=0;
        for(int i =0;i<len;i++){
            fre[A[i]]++;
            if(fre[A[i]]==2)count++;

            fre[B[i]]++;
            if(fre[B[i]]==2)count++;
            
            res[i]=count;
        }
        return res;
    }
}