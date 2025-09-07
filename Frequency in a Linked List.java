/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
// complete the below function
class Solution {
    public static int count(Node head, int key) {
        // code here
        
        Node curr=head;
        int cnt=0;
        while(curr!=null)
        {
            if(curr.data==key)
            {
                cnt++;
            }
            curr=curr.next;
           
        }
         return cnt;
        
    }
}
