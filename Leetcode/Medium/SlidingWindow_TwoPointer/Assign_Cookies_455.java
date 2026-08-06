import java.util.Arrays;

public class Assign_Cookies_455 {
    public int findContentChildren(int[] Student, int[] Cookie) {
        
        Arrays.sort(Student);
        Arrays.sort(Cookie);
        
        int left=0,right=0;
        while(left<Cookie.length && right<Student.length){
            if(Cookie[left]>=Student[right]){
                right++;
            }
            left++;
        }

        return right;
    }
}
