class Solution {
    public Node sortedInsert(Node head, int data) {
        Node current = head;
        Node new_Node = new Node(data);
        if (current == null) {
            new_Node.next = new_Node;
            return new_Node;
        }
        else if (current.data >= new_Node.data) {
            while (current.next != head)
                current = current.next;
            current.next = new_Node;
            new_Node.next = head;
            return new_Node;
        }
        else {
            while (current.next != head && current.next.data < new_Node.data)
                current = current.next;
            new_Node.next = current.next;
            current.next = new_Node;
            return head;
        }
    }
}
