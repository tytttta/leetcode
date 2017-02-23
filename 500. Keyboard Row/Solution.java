public class Solution {
    public String[] findWords(String[] words) {
        if(words==null || words.length==0)
            return words ;
        int [] arr=new int [128];
        StringBuilder sb=new StringBuilder();
        arr['a']=10;arr['b']=23;arr['c']=21;arr['d']=12;arr['e']=2;arr['f']=13;
        arr['g']=14;arr['h']=15;arr['i']=7;arr['j']=16;arr['k']=17;arr['l']=18;
        arr['m']=25;arr['n']=24;arr['o']=8;arr['p']=9;arr['q']=0;arr['r']=3;
        arr['s']=11;arr['t']=4;arr['u']=6;arr['v']=22;arr['w']=1;arr['x']=20;
        arr['y']=5;arr['z']=19;
        for(int i=0;i<words.length;i++){
            String word=words[i].toLowerCase();
            int temp=arr[word.charAt(0)];
            int j=1;
            for(;j<words[i].length();j++){
                if(temp<10){
                    if(arr[word.charAt(j)]<10)
                        continue;
                    else 
                        break;
                }
                else if(temp<19){
                    if(arr[word.charAt(j)]<19 && arr[word.charAt(j)]>9 )
                        continue;
                    else 
                        break;
                }
                else{
                    if(arr[word.charAt(j)]>18 && arr[word.charAt(j)]<26 )
                        continue;
                    else 
                        break;
                }
            }
            if(j==word.length())
                sb.append(words[i]+" ");
        }
        if(sb.length()==0){
            String []s={};
            return s;
        }
           
        return sb.toString().trim().split(" ");
        
    }
        
}