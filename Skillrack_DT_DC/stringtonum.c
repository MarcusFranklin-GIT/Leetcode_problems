#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);
    int result = stringToInteger(str);
    printf("The integer value is: %d\n", result);
    return 0;
}


int stringToInteger(char *str)
{
    char nums[6];
    int index=0;
    int ans=0;
    for(int i=0;i<strlen(str);i++){
        nums[index]=str[i];
        nums[++index]='\0';
        if(strcmp(nums,"zero")==0){
            ans*=10;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"one")==0){
            ans*=10;
            ans+=1;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"two")==0){
            ans*=10;
            ans+=2;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"three")==0){
            ans=(ans*10)+3;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"four")==0){
            ans=(ans*10)+4;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"five")==0){
            ans=(ans*10)+5;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"six")==0){
            ans=(ans*10)+6;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"seven")==0){
            ans=(ans*10)+7;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"eight")==0){
            ans=(ans*10)+8;
            strcpy(nums,"");
            index=0;
        }else if(strcmp(nums,"nine")==0){
            ans=(ans*10)+9;
            strcpy(nums,"");
            index=0;
        }else{
            continue;
        }
    }
    
    return ans;
}