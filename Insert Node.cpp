
class Solution {
  public:
    Node *insertAtEnd(Node *head, int x) {
        // Code hereNode insertAtEnd(Node head, int x) 
        {
        // code here
         Node* temp = new Node(x); 
          if (head == nullptr) {
            return temp; // If the list is empty, return the new node
        }
         Node* last = head;
        while(last->next!=NULL)
        {
            
            last=last->next;
        }
        last->next=temp;
        return head;
    }
    }
};
