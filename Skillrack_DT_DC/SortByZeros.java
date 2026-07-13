
import java.util.*;
public class SortByZeros {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		
		List<Countpair> res = new ArrayList<>();
		
		for(int row=1;row<=R ;row++){
		    int cnt=0;
		    for(int col=0;col<C;col++){
		        int num = sc.nextInt();
		        if(num==0)cnt++;
		    }
		    res.add(new Countpair(row,cnt));
		}
		
		Collections.sort(res,(a,b)->{
		    if(a.cnt!=b.cnt){
		        return Integer.compare(a.cnt,b.cnt);
		    }
		    return Integer.compare(a.row,b.row);
		});
		
		
		for(Countpair curr : res){
		    System.out.print(curr.row+" ");
		}

	}
}

class Countpair{
    int row;
    int cnt;
    
    Countpair(int row,int cnt){
        this.row=row;
        this.cnt=cnt;
    }
}