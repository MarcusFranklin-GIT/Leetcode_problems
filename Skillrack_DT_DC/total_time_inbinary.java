import java.util.*;
public class total_time_inbinary {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		int sec=0,min=0,hr=0;
		for(int i=0;i<N;i++){
		   String S=sc.nextLine();
		   sec+=bintodec(S);
		}
		min=sec/60;
		hr=min/60;
		int Rsec=sec%60;
		int Rmin=min%60;
		System.out.printf("%02d:%02d:%02d",hr,Rmin,Rsec);
		

	}
	public static int bintodec(String S){
	    int len=8,sum=0,p=0;
	    while(--len>0){
	        int val=S.charAt(len)-'0';
	        sum+=(val*Math.pow(2,p++));
	    }
	    return sum;
	}
}
// This code reads a number of binary strings, converts each to decimal, sums them up, and then formats the total time in hours, 
// minutes, and seconds. It uses a method to convert binary strings to decimal inegers and prints the result in a specific format.
// It handles the conversion of binary time representations to a total time in the format HH:MM:SS.
// The main method reads the number of binary strings, processes each string to calculate the total time