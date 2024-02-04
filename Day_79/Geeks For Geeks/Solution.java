class Solution {
    int length(Node n) {
        int ret = 0;
        while (n != null) {
            ret++;
            n = n.next;
        }
        return ret;
    }
    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public Node subLinkedList(Node l1, Node l2) {
        while (l1 != null && l1.data == 0) {
            l1 = l1.next;
        }
        while (l2 != null && l2.data == 0) {
            l2 = l2.next;
        }
        int n1 = length(l1);
        int n2 = length(l2);
        if (n1 == 0 && n2 == 0) {
            return new Node(0);
        }
        if (n2 > n1) {
            Node temp = l1;
            l1 = l2;
            l2 = temp;
        }
        if (n1 == n2) {
            Node t1 = l1;
            Node t2 = l2;
            while (t1.data == t2.data) {
                t1 = t1.next;
                t2 = t2.next;

                if (t1 == null) {
                    return new Node(0);
                }
            }

            if (t2.data > t1.data) {
                Node temp = l1;
                l1 = l2;
                l2 = temp;
            }
        }
        l1 = reverse(l1);
        l2 = reverse(l2);
        Node res = null;
        Node t1 = l1;
        Node t2 = l2;
        while (t1 != null) {
            int small = 0;
            if (t2 != null) {
                small = t2.data;
            }
            if (t1.data < small) {
                if (t1.next != null) {
                    t1.next.data -= 1;
                }
                t1.data += 10;
            }
            Node n = new Node(t1.data - small);
            n.next = res;
            res = n;

            t1 = t1.next;
            if (t2 != null) {
                t2 = t2.next;
            }
        }
        while (res != null && res.next != null && res.data == 0) {
            res = res.next;
        }
        return res;
    }
}
