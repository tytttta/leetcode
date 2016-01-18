问题描述：判断两个字符串是否是变形词，即两个单词字母和字母数目都一样，只是字母排列的顺序不同。

思路分析：1.将第一个字符串存入hashtable中，第二字符串中的每个字母与hashtable中的值相比，找不到，返回false，不是变形词，
          找到的话，删除相应的键值对，知道找完第二个字符串中的所有字母，并检查hashtable是否为空。
          
          注意：此方法错误，当删除hashtable中的数据值，不能删除相对应的键值，，因为hashtable删除键值后，该项消失，
                后面的键值会相应前移
           for(i=0;i<s.length();i++)
            {
                ht.put(i,sch[i]);
            }
          for(i=0;i<t.length();i++)
           {
                     if(ht.contains(tch[i]))
                     {
                       ht.remove(i);
                    }
                       else
               break;
           }
           
           2.利用iterator进行删除
