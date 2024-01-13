class Solution
{
    public static Node insertionSort(Node head)
    {
        if(head == null || head.next == null) return head;
        
        Node sortedHead = new Node(-1);
        Node currentHead = head;
        
        while(currentHead != null) {
            Node nextNode = currentHead.next;
            Node dummyNode = sortedHead;
           
            while(dummyNode.next != null && dummyNode.next.data <= currentHead.data) {
                dummyNode = dummyNode.next;
            }
            
            currentHead.next = dummyNode.next;
            dummyNode.next = currentHead;
            currentHead = nextNode;
        }
        return sortedHead.next;
    }
}
