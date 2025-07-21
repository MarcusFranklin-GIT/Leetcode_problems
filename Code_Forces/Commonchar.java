import java.util.Scanner;

public class Commonchar {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine(); 

        String []strs=new String[n];
        for(int i=0;i<n;i++){
            strs[i]=sc.nextLine();
        }

        int fre[]=new int[26];
        for(int i=0;i<n;i++){
            for(char ch:strs[i].toCharArray()){
                if(fre[ch-'a']==i){
                    fre[ch-'a']++;
                    if(fre[ch-'a']==n) System.out.print(ch);
                }
            }
        }
    }
}
