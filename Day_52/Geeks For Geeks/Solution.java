class GfG
{
    Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    
    Node mergeResult(Node head1, Node head2)
    {
        Node dummyNode = new Node(0); 
        Node tail = dummyNode; 
        while(true)  
        { 
            if(head1 == null) 
            { 
                tail.next = head2; 
                break; 
            } 
            if(head2 == null) 
            { 
                tail.next = head1; 
                break; 
            } 
            if(head1.data <= head2.data) 
            { 
                tail.next = head1;
                head1 = head1.next; 
            }  
            else
            { 
                tail.next = head2; 
                head2 = head2.next; 
            } 
            tail = tail.next; 
        } 
        return reverse(dummyNode.next);
    }
}
