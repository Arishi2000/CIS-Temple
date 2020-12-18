
public class KthFromEndRemover {
    public static void removeKthNodeFromEnd(LinkedList head, int k) {
        int len = 0;
        LinkedList tmp = head;
        while (tmp != null)
        {
            len++;
            tmp = tmp.next;
        }
        // k > length, then we can't remove any node
        if (k > len)
        {
            return;
        }
        // We need to remove head node
        else if (k == len)
        {
            // Return head.next
            head = head.next;
        }
        else
        {
            // Remove len - k th node from starting
            int diff = len - k;
            LinkedList prev = null;
            LinkedList curr = head;
            for(int i = 0; i < diff; i++)
            {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
        }
    }
    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}

