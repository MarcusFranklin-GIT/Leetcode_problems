import java.util.Scanner;

public class Disjoint_leader {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int[] leaders=new int[N+1];
        for(int i=0;i<=N;i++){
            leaders[i]=i;
        }
        int Queries[][]={{1, 2}, {2, 5},{5,7},{6,9},{9,5},{10,11}};

        for(int q=0;q<Q;q++){
            int x=Queries[q][0];
            int y=Queries[q][1];
            change(leaders,x,y);
        }



        for(int i=1;i<=N;i++){
            System.out.print(leaders[i]+" ");
        }
        System.out.println();
        for(int i=1;i<=N;i++){
            System.out.print(find(leaders[i],leaders)+" ");
        }
        sc.close();
    }

    private static void change(int[] leader, int x, int y) {
        int left=find(x,leader);    
        int right=find(y,leader);
        if(left!=right){
            leader[right]=left;
        }
    }
    private static int find(int node,int leader[]){
        if(leader[node]==node) return node;
        leader[node]=find(leader[node],leader);
        return leader[node];
    }
}
