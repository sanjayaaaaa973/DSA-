/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        if(head==null){
            return head;
        }

        if(head.next==null){
            return head;
        }

        ListNode pnode=null;
        ListNode cnode=head;

        while(cnode!=null){
            ListNode nnode=cnode.next;
            cnode.next=pnode;
            pnode=cnode;
            cnode=nnode;
        }
        head=pnode;

        return head;
    }
}