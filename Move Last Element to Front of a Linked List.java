/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static Node moveToFront(Node head) {
        // code here
        if(head==null || head.next==null)
        {
            return head;
        }
        Node secLast=null;
        Node last=head;
        
        
        // Traverse to find the last and second-last nodes
        while(last.next!=null)
        {
            secLast=last;
            last=last.next;
        }
        
        //detach the last node
        secLast.next=null;
        
        
        //move the last node to  the front
        
        last.next=head;
        head=last;
        return head;
        
        
    }
}
