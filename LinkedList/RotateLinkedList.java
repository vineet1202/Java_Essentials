package LinkedList;

public class RotateLinkedList {
    public static void main(String[] args){
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addAtEnd("ABC");
        linkedList1.addAtEnd("DFG");
        linkedList1.addAtEnd("XYZ");
        linkedList1.addAtEnd("EFG");
            
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAtEnd("ABC");
        linkedList2.addAtEnd("DFG");
        linkedList2.addAtEnd("XYZ");
        linkedList2.addAtEnd("EFG");
            
        System.out.println("Initial List");
        linkedList1.display(linkedList1.getHead());

        System.out.println("\nList after left shifting by 2 positions");
        Node newHead = shiftListRightBrute(linkedList1, 2);
        linkedList1.display(newHead);

        System.out.println("Initial List");
        linkedList1.display(linkedList2.getHead());

        System.out.println("\nList after left shifting by 2 positions");
        Node newHead2 = shiftListRightOptimal(linkedList2, 2);
        linkedList1.display(newHead2);
            
    }


    // TC - O(lenOfLL*n)  where n = no of right shifts
    // SC - O(1)
    public static Node shiftListRightBrute(LinkedList linkedList, int n){
        Node head = linkedList.getHead();
        if(head==null || head.getNext()==null){
            return head;
        }

        //for each nth rotation, find the last element of the list and move it to the first
        for(int i=0; i<n; i++){
            Node temp = head;
            while(temp.getNext().getNext()!=null){
                temp = temp.getNext();
            }
            Node end = temp.getNext();
            temp.setNext(null); //setting second last node.next = null
            end.setNext(head);
            head = end;
        }
        return head;
    }

    //The idea is to first convert the linked list to circular linked list by updating the next pointer of last node to the head of linked list. 
    // Then, traverse to the kth node and update the head of the linked list to the (k+1)th node. 
    // Finally, break the loop by updating the next pointer of kth node to NULL.

    // TC - O(n)
    // SC - O(1)
    public static Node shiftListRightOptimal(LinkedList linkedList, int n){
        Node head = linkedList.getHead();
        if(head == null || head.getNext() == null ){
            return head;
        }

        Node temp = head;
        int len = 1 ;
        while ( temp.getNext()!=null){
            len++;
            temp = temp.getNext();
        }

        //link last node to first node
        temp.setNext(head);
        n = n%len;
        int end = len - n;

        while(end-- != 0){
            temp = temp.getNext();
        }
        head = temp.getNext();
        temp.setNext(null);
        return head;
    }
}
