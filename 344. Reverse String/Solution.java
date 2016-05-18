public class Solution {
    public String reverseString(String s) {
        char []s1=s.toCharArray();
        int len=s.length();
        for(int i=0;i<len/2;i++)
        {
            char ch=s1[i];
            s1[i]=s1[len-1-i];
            s1[len-1-i]=ch;
        }
        return new String(s1);
    }
}