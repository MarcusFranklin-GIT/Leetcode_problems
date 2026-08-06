public class Maximum_Ice_Cream_Bars_1833 {
    public int maxIceCream(int[] costs, int coins) {
        int max_num=0;
        for(int cost:costs){
            max_num = Math.max(max_num,cost);
        }

        int fre[] = new int[max_num+1];

        for(int cost: costs){
            fre[cost]++;
        }

        int bars=0;
        for(int i=0 ; i<=max_num ; i++){
            if(fre[i]==0)continue;

            int canBuy = Math.min(fre[i], coins / i);

            bars += canBuy;
            coins -= canBuy * i;

            if (coins < i)
                break;
        }

        return bars;
    }
}
