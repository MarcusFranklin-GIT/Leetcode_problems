#include <stdio.h>
#include <string.h>
#include <stdlib.h>
char* getAbbreviation(char *str);

int main(){
    char str[100];
    printf("Enter a string: ");
    // Use fgets to allow spaces in input
    if (fgets(str, sizeof(str), stdin)) {
        // Remove trailing newline if present
        size_t ln = strlen(str);
        if (ln > 0 && str[ln-1] == '\n') str[ln-1] = '\0';
    }
    char *abbreviation = getAbbreviation(str);
    printf("The abbreviation is: %s\n", abbreviation);
    free(abbreviation);
    return 0;
}
char* getAbbreviation(char *str)
{
    int len=strlen(str);
    char *ans=(char*)malloc(len+1);
    int index=1;
    if(str[0]!='\0'){
        if(str[0]>='a' && str[0]<='z'){
            ans[0]=(str[0]-'a')+'A';
        }else{
            ans[0]=str[0];
        }
    }
    ans[1]='\0';
    for(int i=1;i<len-1;i++){
        if(str[i-1]==' ' &&str[i]!=' '){
            if(str[i]>='a' && str[i]<='z'){
                ans[index++]=(str[i]-'a')+'A';
            }else{
                ans[index++]=str[i];
            }
        }
    }
    ans[index]='\0';
    return ans;

}