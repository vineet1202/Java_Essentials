package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addAtEnd("A");
        linkedList1.addAtEnd("B");
        linkedList1.addAtEnd("C");
        linkedList1.addAtEnd("D");

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAtEnd("A");
        linkedList2.addAtEnd("B");
        linkedList2.addAtEnd("C");
        linkedList2.addAtEnd("D");

        System.out.println("Initial List");
        linkedList1.display(linkedList1.getHead());

        System.out.println("\nList after reversal");
        Node newHead = reverseListIterative(linkedList1.getHead());
        linkedList1.display(newHead);

        System.out.println("Initial List");
        linkedList1.display(linkedList2.getHead());

        System.out.println("\nList after reversal");
        Node newHead2 = reverseListRecursive(linkedList2.getHead());
        linkedList1.display(newHead2);

    }

    //Using three pointers - Iterative
    // TC - O(n) 
    // SC - O(1)
    public static Node reverseListIterative(Node head){
        Node curr = head, prev = null, next;

        while(curr!=null){
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        return prev;
    }
 
    // Recursion - O(n) Time and O(n) Space
    public static Node reverseListRecursive(Node head){
        if(head==null || head.getNext()==null){
            return head;
        }

        Node rest = reverseListRecursive(head.getNext());

        head.getNext().setNext(head);
        head.setNext(null); // eventually the original headNode will point to null

        return rest;

    }
}
