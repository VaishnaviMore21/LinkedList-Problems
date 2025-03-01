
class Solution {
    public static Node findIntersection(Node head1, Node head2) {
        // code here.
        Node p1=head1,p2=head2;
        Node head=null,tail=null;
        while(p1!=null && p2!=null)
        {
            if(p1.data > p2.data)
            {
                p2=p2.next;
            }
            else if(p2.data >p1.data)
            {
                p1=p1.next;
            }
            else
            {
                  if (head == null) {
                    head = tail = new Node(p1.data);
                    // Create a new head for the
                    // intersection list
                }
                else {
                    // Append the new node to the end of the
                    // intersection list
                    tail.next = new Node(p1.data);
                    tail = tail.next;
                }
                p1=p1.next;
                p2=p2.next;
            }
        }
        return head;
    }
}
