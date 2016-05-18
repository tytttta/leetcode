public class Solution {
    public boolean isAnagram(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2)
            return false;
        int []array=new int[256];
        for(int i=0;i<len1;i++)
        {
            ++array[s.charAt(i)];
            --array[t.charAt(i)];
        }
        for(int i=0;i<256;i++)
        {
            if(array[i]!=0)
                return false;
        }
        return true;
    }
}