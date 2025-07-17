import java.util.Scanner;

public class trek {
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] weather = new int[n];

            for (int i = 0; i < n; i++) {
                weather[i] = sc.nextInt();
            }
            int res = 0, cur = 0;

            for (int i = 0; i < n; i++) {
                if (weather[i] == 0) {
                    cur++;
                } else {
                    cur = 0;
                }

                if (cur == k) {
                    res++;
                    cur = 0;
                    i++;
                }
            }

            System.out.println(res);
        }
        sc.close();
    }
    
    
}

