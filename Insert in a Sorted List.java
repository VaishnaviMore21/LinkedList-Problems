/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int x) {
        // Add your code here.
        Node newNode=new Node(x);
        if(head==null)
        {
            return newNode;
        }
        
        //case 2:insert at beiginning
        if(x<=head.data)
        {
            newNode.next=head;
            return newNode;
        }
        
        
        //case 3: Traverse and find insert position
        Node current=head;
        while(current.next!=null && current.next.data<x)
        {
            current=current.next;
            
        }
        
        
        //insert newnode after current
        newNode.next=current.next;
        current.next=newNode;
        return head;
    }
}
