public class Solution {
    public boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            for(;j<t.length();j++)
            {
                if(s.charAt(i)==t.charAt(j) )
                {  
                    if( j!=t.length()-1)
                        j++;
                    break;
                }
            }
            if(j==t.length())
                return false;
        }
        return true;
    }
}