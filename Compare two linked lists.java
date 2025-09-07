/*  Structure of Node
class Node
 {
    char data;
    Node next;

    // Constructor to create a new node
    Node(char d)
    {
       data = d;
       next = null;
    }
 }*/

class Solution {
    int compare(Node head1, Node head2) {
        // Your code here
        Node p1=head1;
        Node p2=head2;
        while(p1!=null && p2!=null)
        {
            if (p1.data > p2.data) return 1;
            if (p1.data < p2.data) return -1;
            
            // move forward
            p1 = p1.next;
            p2 = p2.next;
        }
        // If both ended → equal
        if (p1 == null && p2 == null) return 0;
        
        // If first still has characters → it's greater
        if (p1 != null) return 1;
        
        // Otherwise second is greater
        return -1;
    }
}
