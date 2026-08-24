import java.util.HashMap;
class Cinema_Seat_Allocation_1386 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        HashMap<Integer ,Integer> map = new HashMap<>();

        for(int[] reserved : reservedSeats){
            int row = reserved[0]-1;
            int seat = reserved[1]-1;
            

            int val = 1<<seat;

            map.put(row,map.getOrDefault(row,0)|val);
        }

        //two set in same row
        int option1 = 510;

        // for first set in a row
        int option2 = 480;

        //for second
        int option3 = 120;

        //for third
        int option4 = 30;

        int count = (n-map.size())*2;

        for(int key : map.keySet()){
            if((map.get(key) & option1) ==0)count+=2;
            else if((map.get(key) & option2) ==0 || (map.get(key) & option3) ==0 || (map.get(key) & option4) ==0)count++;
        }

        return count;
    }
}