package filtration_test;
import java.util.*;

public class Minimum_Coin_Amount_Impossible {
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int coins[] = new int[n];
        for(int i=0;i<n;i++)coins[i]=sc.nextInt();

        Arrays.sort(coins);
        int res=1;
        for(int coin:coins){
            if(coin<=res){
                res+=coin;
            }
        }
        System.out.println(res);    
    }
}


// Minimum Coin Amount Impossible
//A shop keeper has certain coins and he wants to know the minimum amount that he cannot give with these coins. Help him out by completing the program.

// Example Input/Output 1:
// Input:
// 5
// 1 2 10 7 4

// Output:
// 25

// Example Input/Output 2:
// Input:
// 5
// 1 2 4 7 20

// Output:
// 15