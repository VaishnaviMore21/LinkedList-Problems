class Solution {
    boolean isCircular(Node head) {
        // Your code here
      if(head==null)return true;
      Node temp=head;
      while(head!=null && head.next!=temp){
          head=head.next;
      }
      if(head==null || head.next==null)
      {
          return false;
      }
      return true;
    }
}
