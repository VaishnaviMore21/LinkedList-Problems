/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class Solution {
    public Node moveZeroes(Node head) {
        // Your Code here.
        if(head==null || head.next==null)return head;
        Node prev=head;
        Node temp=head.next;
        while(temp!=null)
        {
            if(temp.data==0)
            {
                prev.next=temp.next;
                
                
                temp.next=head;
                
                head=temp;
                
                temp=prev.next;
                
            }
            else
            {
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
        
    }
}
