#include <stdio.h>
int main(){
    char str[100];
    scanf("%s",str);
    char *result=moveLowerUpperCase(str);
    printf("%s\n",result);
    free(result);
    return 0;
}
char* moveLowerUpperCase(char *str)
{
    int len=strlen(str);
    char *ans=(char*)malloc(len+1);
    
    int up=0,low=0;
    for(int i=0;i<len;i++){
        if(str[i]<='Z' && str[i]>='A')up++;
        if(str[i]<='z' && str[i]>='a')low++;
    }
    int num=low;
    up=len-up;
    low=0;
    for(int i=0;i<len;i++){
        if(str[i]<='z' && str[i]>='a')ans[low++]=str[i];
        else if(str[i]<='Z' && str[i]>='A')ans[up++]=str[i];
        else ans[num++]=str[i];
    }
    ans[len]='\0';
    return ans;
}