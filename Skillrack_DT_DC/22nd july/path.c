#include<stdio.h>
#include<stdlib.h>

int min(int a,int b){
    return (a>b) ? b : a ;
}

int max(int a,int b){
    return (a>b) ? a : b ;
}

int main()
{
    int N;
    scanf("%d",&N);
    
    int mat[N][N];
    
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if(j==N-1){
                scanf("%d",&mat[i][j]);
            }else{
                scanf("%d,",&mat[i][j]);
            }
        }
    }
    
    int dp[N][N];
    dp[0][0]=mat[0][0];
    
    
    for(int i=1;i<N;i++){
        dp[0][i] = max(dp[0][i-1],mat[0][i]);
        dp[i][0] = max(dp[i-1][0],mat[i][0]);
    }
    
    
    
    for(int i=1;i<N;i++){
        for(int j=1;j<N;j++){
            int top = max(dp[i-1][j],mat[i][j]);
            int left = max(dp[i][j-1],mat[i][j]);
            
            dp[i][j] = min(top,left);
        }
    }
    
    printf("%d",dp[N-1][N-1]);
    return 0;
    
    

}