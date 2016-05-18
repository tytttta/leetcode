public class Solution {
    public int strStr(String haystack, String needle) {
        int len1=haystack.length();
        int len2=needle.length();
        if(len1<len2)
            return -1;
        if(len1==0 && len2==0)
            return 0;
        for(int i=0;i<len1-len2+1;i++)
        {
            int j=0;
            while(j<len2 && haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;
            }
            if(j==len2)
                return i;
        }
        return -1;
        
    }
}