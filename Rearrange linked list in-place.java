class Solution {
    public Node inPlace(Node root) 
    {
        // Code Here//Position this line where user code will be pasted.
        if(root==null ||root.next==null)return root;
        Node slow=root,fast=root;
        while(fast!=null && fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        Node second=slow.next;
        slow.next=null;
        
        
        second=reverse(second);
        
        
         Node first=root;
         while(first!=null && second!=null)
         {
             Node temp1=first.next;
             Node temp2=second.next;
             first.next=second;
             second.next=temp1;
             
            first = temp1;
            second = temp2;
         }
               return root;
    }
     // Helper function to reverse a linked list
    static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
