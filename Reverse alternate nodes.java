
class Solution {
    public static void rearrange(Node odd) {
        // add your code here
        if(odd==null || odd.next==null)return;
        Node even=odd.next;
        Node evenHead=even;
        while(odd.next!=null && even.next!=null)
        {
            odd.next=even.next;
            odd=odd.next;
            
            if(odd.next!=null &&even.next!=null)
            {
                 even.next = odd.next;
                even = even.next;
            }
        }
        even.next=null;
        Node prev=null,curr=evenHead;
        while(curr!=null)
        {
            Node nextNode =curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        odd.next=prev;
    }
}
