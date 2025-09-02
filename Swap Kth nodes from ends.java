
class Solution {
    public Node swapKth(Node head, int k) {
        // code here
        if(head==null)return head;
        int n=0;
        Node temp=head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
            
        }
     // Edge cases
        if (k > n || 2 * k - 1 == n) return head;
    //Finding kth NOde from start(x) and its previous(prevx)
    Node prevx=null,x=head;
    for(int i=1;i<k;i++)
    {
        prevx=x;
        x=x.next;
    }
    
    Node prevy=null,y=head;
    for(int i=1;i<n-k+1;i++)
    {
        prevy=y;
        y=y.next;
    }
    if(prevx!=null)prevx.next=y;
    if(prevy!=null)prevy.next=x;
    
        // Swap next pointers
        Node tempNext = x.next;
        x.next = y.next;
        y.next = tempNext;

        // Adjust head if swapping includes head or tail
        if (k == 1) head = y;
        if (k == n) head = x;

        return head;
    }
}
