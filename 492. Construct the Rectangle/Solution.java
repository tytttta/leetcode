public class Solution {
    public int[] constructRectangle(int area) {
        int [] res=new int[2];
        int len=(int)Math.sqrt(area);
        while(len<=area){
            int wid=area/len;
            
            
            /**
              while(area%len != 0){
                len ;
              }
        }*/
            
            if(wid*len==area && len>=wid){
                break;
            }
            else{
                len++;
            }
        }
        res[0]=len;
        res[1]=area/len;
        return res;
    }
}