#include <stdio.h>
int main(){
    char str1[] = "ababaab";
    char str2[] = "babaabb";
    char ch = '&';
    char* result = evaluateBitwise(str1, str2, ch);
    printf("Result: %s\n", result);
    free(result);
    return 0;
}

char* evaluateBitwise(char str1[], char str2[], char ch)
{
int i;
int ans;
int len = strlen(str1);
char* result=(char*)malloc(sizeof(char)*(len+1));
for(i=0; i<len; i++)
{
    if (ch=='&'){
        ans=(str1[i]-'a') & (str2[i]-'a');
    }else if(ch=='|'){
        ans = (str1[i]-'a') | (str2[i]-'a');
    }else{
        ans =(str1[i]-'a')^(str2[i]-'a');
    }
    result[i]=(char)'a'+ans;
}
result[len]='\0';
return result;

}