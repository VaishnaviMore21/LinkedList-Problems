//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedList {

    /* Function to print linked list */
    public static void print(Node root) {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) throws IOException {

        /* Constructed Linked List is 1.2.3.4.5.6.
         7.8.8.9.null */
        int value;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {

            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node copy = head;
            for (int i = 1; i < s.length; i++) {
                Node temp = new Node(Integer.parseInt(s[i]));
                copy.next = temp;
                copy = copy.next;
            }
            Solution ob = new Solution();
            Node result = ob.compute(head);
            print(result);
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) 
        // your code here
        {
          head = reverseList(head);

        // 2) In the reversed list, delete nodes 
        // which have a node with greater value 
        // node on the left side.
        head = delLesserNodes(head);

        // 3) Reverse the linked list again to 
        // retain the original order
        head = reverseList(head);

        return head;
        }
    
    static Node reverseList(Node headref) {
        Node curr = headref;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

       static Node delLesserNodes(Node head) {
        Node curr = head;

        Node maxnode = head;
        Node temp;

        while (curr != null && curr.next != null) {
          
            // If curr is smaller than max,
            // then delete curr
            if (curr.next.data < maxnode.data) {
                temp = curr.next;
                curr.next = temp.next;
                temp = null;
            } else {
              
                // If curr is greater than max, 
                // then update max and move curr
                curr = curr.next;
                maxnode = curr;
            }
        }
         return head;
   
}
}
