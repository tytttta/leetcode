/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head==null || head.next==null)
            return head;
        ListNode H=head;
        ListNode L=H.next;
        while(L.next!=null)
        {
            ListNode temp=L.next;
            L.next=L.next.next;
            temp.next=H.next;
            H.next=temp;
            
            H=H.next;
            L=L.next;
            if (L==null)
                break;
        }
        return head;
        
        
    }
}