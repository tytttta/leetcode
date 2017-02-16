public class Solution {
    public int countSegments(String s) {
        int len=0;
        int begin=0,end=0;
        while(begin<s.length()){
            while(begin<s.length() && s.charAt(begin)==' ')
                begin++;
            end=begin;
            while(end<s.length() && s.charAt(end)!=' ')
                end++;
            if(begin!=end)
                len++;
            if(end+1<s.length()){
                s=s.substring(end+1,s.length());
                begin=0;
                end=0;
            }
            else 
                break;
            continue;
        }
        return len;
        
    }
}