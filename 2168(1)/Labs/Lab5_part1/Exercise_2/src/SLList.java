class SLList {
   private Node<Item> first;
   private Node<Item> last;
   private int n; // size of the list

   // helper node class
   private class Node<item> {
      Item item;
      Node<item> next;
   }

   // constructor: initializes an empty list
   public SLList() {
      first = last = null;
      n = 0;
   }

   // is the list empty?
   public boolean isEmpty() {
      return first == null;
   }

   // return the size of the list
   public int size() {
      return n;
   }

   // insert an item at the front of the list
   public void addFirst(Item item) {
      if (isEmpty()) { // first & last refer to the same node
         first = last = new Node<Item>();
         first.item = last.item = item;
      } else { //first refers to the new node
         Node<Item> oldFirst = first;
         first = new Node<Item>();
         first.item = item;
         first.next = oldFirst;
      }
      n++; // increment size after insertion
   }

   // insert item at the end of the list
   public void addLast(Item item) {
      if (isEmpty()) { // first & last refer to the same node
         first = last = new Node<Item>();
         first.item = last.item = item;
      } else { // last.next refers to the new node
         last = last.next = new Node<Item>();
         last.item = item;
      }
      n++; // increment size after insertion
   }

   // remove & return the first item in the list
   public Item removeFirst() {
      if (isEmpty()) throw new RuntimeException("empty list");
      Item removedItem = first.item; // retrieve the data item being removed
      if (first == last) // if there's only one node in the list,
         first = last = null; // update both first & last references
      else // otherwise, update first only
         first = first.next;
      n--; // decrement size after removal
      return removedItem;
   }


   // remove & return the last item in the list
   public Item removeLast() {
      if (isEmpty()) throw new RuntimeException("empty list");
      Item item = last.item; // retrieve the data item being removed

      if (first == last) // if there's only one node in the list,
         first = last = null; // update both first & last references
      else { // iterate through the list to locate the last node
         Node<Item> current = first;
         while (current.next != last)
            current = current.next;
         last = current; // current is the new last node
         current.next = null;
      } // end else
      n--; // decrement size after removal
      return item;
   }

   @Override
   public String toString() {
      StringBuilder s = new StringBuilder();
      Node<Item> current = first;
      while (current != null) {
         s.append(current.item.item + " -> ");
         // s.append(current.item + " ");
         current = current.next;
      }
      s.append("null");
      //s.append("\n");
      return s.toString();
   }

//   return Node at Index k (here index start from 1)
   public Node<Item> getNode(int index) {

      Node<Item> current = first; // created node called current and asigned it to first
      for(int i = 0;i< index;i++){ // for loop to loop thru the list
         current = current.next; // assigning curr node to cur next
      }
      return current; // return the node

   }


//   add after the given index
   public void addAfter(int k, Item item) {

      Node<Item> newnode= new Node<Item>(); // created new node called new node
      newnode.item=item;

      Node<Item> temp= first; // created a new refrence called temp assigned it to the head

      for(int i=1;i<=k;i++) { // looping through the list till we reach k
         temp=temp.next; // updating temp so it goes to next of temp
      }
      newnode.next=temp.next; // then assinged the newnode next to temp next
      temp.next=newnode; // and here swaping temp next to newnode


   }

//   remove after the given node
      public Item removeAfter(Node<Item> node) {

      if (node == null || node.next == null) { // checking if list is empty
            return null; // return null in case it's empty
         }

         Item afterNode = node.next.item; // new refrence called afterNode assigning to node next item
         node.next = node.next.next; // then assigning node next to item after it
         n--; // decrementing
         return afterNode; // eventually returning the refrence afternode
      }




//   remove node at given index k
   public void deleteKth(int k) {

      // If linked list is empty
      if (first == null)
         return;

      // Store head node
      Node<Item> temp = first;

      // If head needs to be removed
      if (k == 0)
      {
         first = temp.next; // Change head
         return;
      }

      // Find previous node of the node to be deleted
      for (int i=0; temp!=null && i<k; i++)
         temp = temp.next;

      // If position is more than number of nodes
      if (temp == null || temp.next == null)
         return;

      // Node temp->next is the node to be deleted
      // Store pointer to the next of node to be deleted
      Node<Item> next = temp.next.next;

      temp.next = next; // Unlink the deleted node from list
   }
}

class Item
{
   int item;

   Item(int item){
      this.item=item;
   }

}

