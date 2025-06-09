/*
  Pairwise swap a linked list
  The input list will have at least one element
  node is defined as

struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

}*head;
*/
class Solution {
  public:
    Node* pairWiseSwap(Node* head) {
        // The task is to complete this method
        
        if(head==NULL || head->next==NULL)
        {
            return head;
        }
        
        Node* first=head;
        Node* sec=head->next;
        Node* prev=NULL;
        while(first!=NULL && sec!=NULL)
        {
            Node* third=sec->next;
            sec->next=first;
            first->next=third;
            if(prev!=NULL)
            {
                prev->next=sec;
            }
            else
            {
                head=sec;
            }
            prev=first;
            first=third;
            if(third!=NULL)
            {
                sec=third->next;
            }
            else
            {
                sec=NULL;
            }
            
        }
        return head;
    }
};
