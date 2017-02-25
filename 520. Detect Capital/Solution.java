public class Solution {
    public boolean detectCapitalUse(String word) {
        if(word==null || word.length()==0)
            return false;
        if(word.toUpperCase().equals(word) || word.toLowerCase().equals(word))
            return true;
        else if(word.substring(1,word.length()).toLowerCase().equals(word.substring(1,word.length())))
            return true;
        else
            return false;
        
    }
}