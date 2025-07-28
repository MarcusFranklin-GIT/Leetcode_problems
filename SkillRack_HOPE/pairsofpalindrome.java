import java.util.*;
public class pairsofpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        sc.nextLine();
        int [] flag=new int[N];

        long res=0L,evenlen=0L,oddlen=0L;

        HashMap<Integer,Long> oddMap=new HashMap<>();
        HashMap<Integer,Long> othersMap=new HashMap<>();

        

        for(int i=0;i<N;i++){
            String str=sc.nextLine();
            for(int j=0;j<str.length();j++){
                flag[i] ^= (1 << (str.charAt(j) - 'a'));
            }

            if(flag[i]==0){
                evenlen++;
        
            }else if((flag[i]&(flag[i]-1))==0){
                oddlen++;
                oddMap.put(flag[i],oddMap.getOrDefault(flag[i],0L)+1);
            }else{
                othersMap.put(flag[i],othersMap.getOrDefault(flag[i],0L)+1);
            }
            
        }
        res+=((evenlen*(evenlen+1))/2) + (evenlen*oddlen);

        for(int i:oddMap.keySet()){
            long val=oddMap.get(i);

            res+=((val*(val+1))/2);
        }

        for(int i:othersMap.keySet()){
            long val=othersMap.get(i);

            res+=((val*(val+1))/2);
        }

        System.out.println(oddMap.toString());
        System.out.println(othersMap.toString());

        System.out.println(res);
        
        sc.close();
    }
}
