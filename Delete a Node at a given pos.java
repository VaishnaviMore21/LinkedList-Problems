/****************************************************************

	Following is the Node class already written for the Linked List

	class  Node<T> {
    	T data;
    	 Node<T> next;
    
    	public  Node(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/

public class Solution {
	public static Node<Integer> deleteNode( Node<Integer> head, int position) {
		// Write your code here.
		Node temp=head;
		Node prev=null;
		  // Base case if linked list is empty
        if (temp == null)
            return head;

        // Case 1: Head is to be deleted
        if (position == 0) {
            head = temp.next;
            return head;
        }
		 for (int i = 0; temp != null && i < position; i++) {
            prev = temp;
            temp = temp.next;
        }
		 if (temp != null) {
            prev.next = temp.next;
        }
       

        return head;

	}
}
