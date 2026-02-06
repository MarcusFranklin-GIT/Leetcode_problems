#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

typedef struct BoundedArray {
    int SIZE;
    int *arr;
} boundedArray;


boundedArray* getArrayFromString(char *str, int K)
{
    int len=strlen(str);
    int count=len/K;
    
    boundedArray *result=(boundedArray *)malloc(sizeof(boundedArray));
    result->SIZE=count;
    
    result->arr=(int*)malloc(sizeof(int)* count);
    
    for(int i=0;i<count;i++){
        int num=0;
        for(int j=0;j<K;j++){
            num*=10;
            num+=str[(i*K)+j]-'0';
        }
        while(num<pow(10,K-1))num*=10;
        result->arr[i]=num;
    }
    return result;
}

int main() {
    char str[100];
    int K;

    scanf("%s", str);
    scanf("%d", &K);

    boundedArray *res = getArrayFromString(str, K);

    for(int i = 0; i < res->SIZE; i++){
        printf("%d ", res->arr[i]);
    }

    printf("\n");

    // free memory
    free(res->arr);
    free(res);

    return 0;
}
