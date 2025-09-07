// your task is to complete this function

/*class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    // Function to count pairs in two linked lists whose sum is equal to x
    public int countPairs(Node head1, Node head2, int x) {
        // add your code here
        Set<Integer>complements=new HashSet<>();
        for(Node curr=head1;curr!=null ;curr=curr.next)
        {
            complements.add(x-curr.data);
        }
        int count=0;
        for(Node curr=head2;curr!=null;curr=curr.next)
        {
            if(complements.contains(curr.data))
            {
                count++;
            }
        }
        return count;
    }
}
