package dsquestions.linkedlist;

public class SwapNodesInPair {

    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;

        ListNode current=head;
        while (current!=null && current.next!=null){
            ListNode next=current.next;
            int v1=current.val;
            int v2=next.val;
            next.val=v1;
            current.val=v2;
            current=current.next.next;
        }
        return head;

    }
}
