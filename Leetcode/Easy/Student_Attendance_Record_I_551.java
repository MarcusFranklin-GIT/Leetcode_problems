package Leetcode.Easy;
public class Student_Attendance_Record_I_551 {
    public boolean checkRecord(String s) {
        int len=s.length(),abs=0,late=0;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='A')abs++;
            if(s.charAt(i)=='L' && late<3)late++;
            if(s.charAt(i)!='L')late=0;
            if(late==3 || abs==2)return false;
        }
        return true;

    }
}