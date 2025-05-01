class Node{
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

}

class LinkedList{
    private Node head;
    private Node tail;

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }

    public void addAtEnd(String data){
        Node node = new Node(data);

        if(this.head == null){
            this.head = this.tail = node;
        }
        else{
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void addAtBegin(String data){
        Node node = new Node(data);

        if(this.head == null){
            this.head = this.tail = node;
        }
        else{
            node.setNext(head);
            this.head = node;
        }
    }

    public Node find(String data){
        Node temp = this.head;

        while( temp != null ){
            if(temp.getData().equals(data))
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

    public void insertPos(String data, int pos){
        Node node = new Node(data);

        if(this.head == null){
            this.head = this.tail = node;
        }
        else{
            Node temp = this.head;
            Node prev = null;

            int cnt = 1;

            while(temp != null && cnt < pos){
                prev = temp;
                temp = temp.getNext();
                cnt++;
            }

            prev.setNext(node);
            node.setNext(temp);
        }
    }

    public void delete(String data){
        if(this.head == null){
            System.out.println("List is empty!");
        }
        else{
            Node node = this.find(data);

            if(node == null){
                System.out.println("Node not found");
            }
            else if(node == this.head){
                //node to be deleted is the head node
                this.head = this.head.getNext();
                node.setNext(null);
                
                //in case it is the tail node - tail node will be null
                if(node == this.tail){
                    tail = null;
                }
            }
            else{
                Node nodeBefore = null;
                Node temp = this.head;
                while(temp!= null){
                    if(temp.getNext() == node){
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }
                nodeBefore.setNext(node.getNext());
                //if node is tail node
                if(node == this.tail){  //comparing objects for tail
                    //if node is tail then tail and node would refer to the same object
                    this.tail = nodeBefore;
                }
                node.setNext(null);
            }
        }
        
    }

    public void display(){
        Node temp = this.head;
        while(temp != null){
            System.out.printf("%s ", temp.getData());
            temp = temp.getNext();
        }
    }
}

public class ListTester{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtEnd("Milan");
        list.addAtEnd("Venice");
        list.addAtEnd("Munich");
        list.addAtEnd("Vienna");
        System.out.println("Eelments Added -->");
        list.display();
        System.out.println();
        String val = "Venice";
        if(list.find(val) != null){
            System.out.println("Element found " + val);
        }
        else System.out.println("Element not found");
        System.out.println("Eelments Added -->");
        list.insertPos("Berlin", 2);
        list.display();

        list.delete("Munich");
        System.out.println();
        System.out.println("After deletion -->");
        list.display();


    }
    
}
