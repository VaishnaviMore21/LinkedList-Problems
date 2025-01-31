class Solution {
  public:
    Node* divide(Node* head) {
        // code here
    Node *oddHead = new Node(-1), *oddTail = oddHead;
    Node *evenHead = new Node(-1), *evenTail = evenHead;
    Node *curr=head,*temp;
    while(curr)
    {
        temp=curr;
        curr=curr->next;
        if(temp->data & 1)
        {
            oddTail->next=temp;
            oddTail=temp;
        }
        else
        {
            evenTail->next=temp;
            evenTail=temp;
        }
    }
     oddTail->next = NULL;
        evenTail->next = oddHead->next;

        return evenHead->next ? evenHead->next : oddHead->next; 
    }
};
