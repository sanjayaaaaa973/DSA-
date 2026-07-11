/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Node curr=head;

        if (head == null)
    return null;

        while(curr!=null){
            Node nn=new Node(curr.val);
            nn.next=curr.next;
            curr.next=nn;
            curr=nn.next;
        }

        curr=head;
        while(curr!=null){

            if(curr.random!=null)

            curr.next.random=curr.random.next;
            curr=curr.next.next;

        }

        curr=head;
        Node newhead=curr.next;
        Node newcurrent=newhead;
        while(curr!=null){
            curr.next=newcurrent.next;
            curr=curr.next;

            if(curr!=null){
                newcurrent.next=curr.next;
                newcurrent=newcurrent.next;
            }
        }

        return newhead;
    }
}