package Stack;

class Stack{
    private int top;
    private int maxSize;

    private int[] arr;

    Stack(int maxSize){
        this.top = -1;
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public boolean isFull(){
        if(top >= (maxSize -1)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean push(int data){
        if(isFull()){
            return false;
        }
        else{
            ++top;
            arr[top] = data;
            return true;
        }
    }

    public int peek(){
        if( top < 0){
            return Integer.MIN_VALUE;
        }
        else {
            return arr[top];
        }
    }

    public boolean isEmpty(){
        if ( top < 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int pop(){
        if( isEmpty()){
            return Integer.MIN_VALUE;
        }
        else{
            return arr[top--];
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.println("Displaying stack elements: ");
            for( int i=top; i>=0; i--){
                System.out.println(arr[i]);
            }
        }
    }
}