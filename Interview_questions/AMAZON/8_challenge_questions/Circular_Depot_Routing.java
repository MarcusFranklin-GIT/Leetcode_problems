public class Circular_Depot_Routing {
    public static long getTravelCost(int destinations[],int travelCost[]){
        int len = travelCost.length;

        long prefix []  = new long[len];
        long totalSum = travelCost[0];

        for(int i = 1 ; i < len ; i++){
            prefix[i] = totalSum;
            totalSum+=travelCost[i];
        }

        int current = 1;
        long res = 0;


        for(int dest : destinations){
            long CW = 0;
            if(current<=dest){
                CW = prefix[dest-1]-prefix[current-1];
            }else{
                CW = (totalSum - prefix[current-1])+prefix[dest-1];
            }
            long CCW = totalSum - CW;
            res += Math.min(CW,CCW);
            current = dest;
        }
        

        return res;
    }
}
