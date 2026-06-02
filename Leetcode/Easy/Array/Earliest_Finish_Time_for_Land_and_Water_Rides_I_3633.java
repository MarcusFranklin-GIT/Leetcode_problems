class Earliest_Finish_Time_for_Land_and_Water_Rides_I_3633 {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
        int landlen = landStartTime.length;
        int waterlen = waterStartTime.length;

        int ans = Integer.MAX_VALUE;

        for(int i=0;i<landlen;i++){
            for(int j=0;j<waterlen;j++){

                int landFinish = landStartTime[i]+landDuration[i];
                int waterStart = Math.max(landFinish,waterStartTime[j]);
                ans = Math.min(ans,waterStart+waterDuration[j]);

                
                int waterFinish = waterStartTime[j]+ waterDuration[j];
                int landStart = Math.max(waterFinish,landStartTime[i]);
                ans = Math.min(ans,landStart+landDuration[i]);
            }
        }


        return ans;
    }
}