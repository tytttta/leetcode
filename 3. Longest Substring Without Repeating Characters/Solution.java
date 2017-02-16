public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        HashMap<Character,Integer> hm=new HashMap();
        for(int i=0,j=0;j<s.length();j++){
            if(hm.containsKey(s.charAt(j))){
                i=Math.max(i,hm.get(s.charAt(j))+1);
            }
            hm.put(s.charAt(j),j);
            len=Math.max(len,j-i+1);
            
        }
        return len;
    }
}