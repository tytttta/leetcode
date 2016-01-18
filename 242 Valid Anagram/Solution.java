import java.util.Arrays;
public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sch=s.toCharArray();
        char[] tch=t.toCharArray();
        Arrays.sort(sch);
        Arrays.sort(tch);
        s=new String(sch);
        t=new String(tch);
        if(t.equals(s))
            return true;
        else 
            return false;
    }
    
}
