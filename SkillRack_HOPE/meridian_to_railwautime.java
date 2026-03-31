import java.util.*;
public class meridian_to_railwautime {
    private static String convert(String time){
      char timechar[] = time.toCharArray();
      int len = time.length();
      
      if(timechar[len-2]=='A'){
        if(timechar[0]=='1' && timechar[1]=='2'){
          timechar[0]='0';
          timechar[1]='0';
        }
      }else{
        if(!(timechar[0]=='1' && timechar[1]=='2')){
          int t=((timechar[0]-'0')*10)+(timechar[1]-'0');
          t+=12;
          timechar[0]=(char)((t/10)+'0');
          timechar[1]=(char)((t%10)+'0');
        }
      }
      timechar[len-1]=' ';
      timechar[len-2]=' ';
      String res= new String(timechar);
      return  res;
    }
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      
      String time = sc.nextLine();
      
      System.out.print(convert(time));
    }
}