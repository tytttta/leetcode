/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return null;
        ListNode L=new ListNode(head.val);
        head=head.next;
        L.next=null;
        while(head!=null)
        {
            ListNode L2=new ListNode(head.val);
            L2.next=L;
            L=L2;
            head=head.next;
        }
        return L;
        
        
    }
}