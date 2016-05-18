/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode L=new ListNode(-1);
        ListNode H=L;
        while(l1!=null && l2!=null)
        {
            ListNode temp=null;
            if (l1.val<l2.val)
                 {
                     temp=new ListNode(l1.val);
                     l1=l1.next;
                 }
            else
            {
                temp=new ListNode(l2.val);
                l2=l2.next;
            }
            L.next=temp;
            L=L.next;
        } 
        if(l1==null)
            L.next=l2;
        else
            L.next=l1;
        return H.next;
    }
}