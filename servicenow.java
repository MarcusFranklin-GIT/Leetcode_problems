//[1,8,6,2,5,4,8,3,7]

import java.util.*;

class servicenow{

}

public  int findmax(){
    int arr[]={1,8,6,2,5,4,8,3,7};
    int end=arr.length-1;
    int start=0;
    int sum=0,max=0;
    while(start<end){
        max=Math.max(max,Math.min(arr[start],arr[end])*(end-start));
        if(arr[start]<=arr[end]){
            start++;
        }else{
            end--;
        }
    }
} 

start =1;
end =8;
arr[start]=8;
arr[end]=7;


min(8,7)*(8-1) =49;


Math.min(arr[start],arr[end])*(end-start)
