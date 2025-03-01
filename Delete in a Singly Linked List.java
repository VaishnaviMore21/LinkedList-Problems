class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node temp=head;
        Node prev=null;
        if(temp==null)
        {
            return  head;
        }
        if(x==1)
        {
            head=temp.next;
            return head;
        }
        for(int i=1;temp!=null && i<x;i++)
        {
            prev=temp;
            temp=temp.next;
        }
          if (temp != null) {
            prev.next = temp.next;
        }
        else {
            System.out.println("Data not present");
        }

        return head;
        
    }
