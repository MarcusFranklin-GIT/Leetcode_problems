package Leetcode.Easy;
class Divisible_and_Non_divisible_Sums_Difference_2894 {
    public int differenceOfSums(int n, int m) {
        int num1=0,num2=0;
        while(n>0){
            if(n%m!=0)num1+=n;
            else num2+=n;
            n--;
        }
        return num1-num2;
    }
}