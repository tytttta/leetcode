public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len=0;
        if (strs==null|| strs.length==0)
            return "";
        if (strs.length==1)  
            return strs[0];
       while(true){
            int i=0;
            for(;i+1<strs.length;i++){
                if(len<Math.min(strs[i].length(),strs[i+1].length()) && strs[i].charAt(len)==strs[i+1].charAt(len))
                    continue;
                else
                    break;
        }
          if(i+1<strs.length)      
        	  break;
          else
        	  len++;
           
        }
        if(len==0)    
            return "";
        else
            return strs[0].substring(0,len);
        
    }
}