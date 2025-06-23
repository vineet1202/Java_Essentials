package Queue;

class Queue {
    private int front, rear, maxSize;
    private String arr[];

    Queue(int maxSize){
        this.front = 0;
        this.rear = -1;
        this.maxSize = maxSize;
        this.arr = new String[this.maxSize];
    }

    public boolean isFull(){
        if( this.rear == this.maxSize -1){
            return true;
        }
        return false;
    }

    public boolean enqueue(String data){
        if(isFull()){
            return false;
        }
        else{
            arr[++rear] = data;
            return true;
        }
    }

    public boolean isEmpty(){
        if( front > rear){
            return true;
        }
        else return false;
    }

    public String dequeue(){
        if( isEmpty()){
            return "Empty queue";
        }
        else{
            String data = arr[this.front]; 
            arr[front++] = null;
            return data;
        }
    }

    public void display(){
        System.out.println("Displaying queue elements: ");
        for(int i = front; i<rear; i++){
            System.out.println(arr[i]);
        }
    }

}
