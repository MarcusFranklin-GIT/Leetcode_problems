#include <stdio.h>
void main(){
    char dateStr[15];
    scanf("%s",dateStr);
    struct Date* date = getDateFromString(dateStr);
    printf("Day: %d\n",date->day);
    printf("Month: %s\n",date->month);
    printf("Year: %d\n",date->year);
}

struct Date {
    int day;
    char month[4];
    int year;
};
struct Date* getDateFromString(char *dateStr)
{
    struct Date* date = (struct Date*)malloc(sizeof(struct Date));
    int len=strlen(dateStr);
    int i=0;
    int d=0;
    int y = 0;
    int flag = 0;
    char c[4];
    while(i<len){
        if(dateStr[i+2]=='-' || (flag == 2 && d == 0)){
            d+=dateStr[i++]-'0';
            d= (d*10)+dateStr[i++]-'0';
            i++;
            flag++;
        }else if(dateStr[i+3]=='-' || (flag == 2 && c[0] == '\0')){
            c[0]=dateStr[i++];
            c[1]=dateStr[i++];
            c[2]=dateStr[i++];
            c[3]='\0';
            i++;
            flag++;
        }
        else if(dateStr[i+4] == '-' || (flag == 2 && y == 0)){
            y = (y*10) + dateStr[i++] - '0';
            y = (y*10) + dateStr[i++] - '0';
            y = (y*10) + dateStr[i++] - '0';
            y = (y*10) + dateStr[i++] - '0';
            i++;
            flag++;
        }
    }
    date->day = d;
    strcpy(date->month, c);
    date->year = y;
    return date;
    
}
