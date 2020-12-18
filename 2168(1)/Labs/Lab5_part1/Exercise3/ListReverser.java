
public class ListReverser {
    public static LinkedList reverse(LinkedList head) {
        LinkedList previous = null, current = head;
// Reverse the linked list
// For an example take any list, then try to follow below loop step by step.
        while(current != null){
            head = current; // assigned head to current
            current = current.next; // then current to current next
            head.next = previous;// after that head next to previous
            previous = head; //  and then at the end will assign prev to head and that's how we reverse
        }
// Return new head
        return head;
    }
    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}