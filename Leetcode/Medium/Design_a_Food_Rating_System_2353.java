package Leetcode.Medium;
import java.util.*;
public class Design_a_Food_Rating_System_2353 {
    
}
class FoodRatings {
    HashMap<String,Integer> map1=new HashMap<>();
    HashMap<String,ArrayList<String>>map2=new HashMap<>();
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0;i<foods.length;i++){
            map1.put(foods[i],ratings[i]);
            ArrayList<String> L=map2.getOrDefault(cuisines[i],new ArrayList<>());
            L.add(foods[i]);
            map2.put(cuisines[i],L);
        }
    }
    
    public void changeRating(String food, int newRating) {
        map1.put(food, newRating);
    }
    
    public String highestRated(String cuisine) {
        ArrayList<String> F=map2.get(cuisine);
        int rating=0;
        String food="";
        for(String str:F){
            if(rating<map1.get(str) || (rating == map1.get(str) && food.compareTo(str) > 0)){// lexicographically smaller
                food=str;
                rating=map1.get(str);
                
            }
        }
        return food;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */


 // not working for large inputs
 // TLE