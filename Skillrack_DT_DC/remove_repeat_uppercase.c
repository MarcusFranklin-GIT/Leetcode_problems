
#include <stdio.h>
int main(){
    char str[100];
    scanf("%s", str);
    char *result = removeUpperRepeatLower(str);
    printf("%s\n", result);
    free(result);
    return 0;
    //Given: GreenApple
    //Answer: reennpple
}
char* removeUpperRepeatLower(char *str)
{
    int len=strlen(str);
    char *ans=(char*)malloc(len+1);
    int flag=0;
    int index=0;
    char last;
    for(int i=0;i<len;i++){
        if(str[i]<='z' && str[i]>='a'){
            flag=1;
            ans[index++]=str[i];
            last=str[i];
        }else if(flag==1){
            ans[index++]=last;
        }
    }
    ans[index]='\0';
    if(flag==0)return "-1";
    return ans;
}