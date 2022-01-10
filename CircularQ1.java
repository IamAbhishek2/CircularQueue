 class Queue {

    int size;
    int arr[];
    int front = -1;
    int rear= -1;

    public Queue(int size){
        
        this.size = size;
        arr = new int[size];
    }

    public boolean enqueue(int data){
        if((isFull() == true)){
            return false;
        }
        if(isEmpty()==true){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear]=data;
        return true;

    }

    public boolean dequeue(){
        if(isEmpty() == true){
            return false;
        }
        if(front == rear){
            front = -1;
            rear = -1;
            return true;
        }
        front = (front+1)%size;
        return true;
    }

    public int front(){
        if(isEmpty() == true){
            return -1;
        }
        return arr[front];
    }

    public int rear(){
        if(isFull()== true){
            return -1;
        }
        return arr[rear];
    }

    public boolean isFull(){
        return ((rear+1)%size) == front;
    }

    public boolean isEmpty(){
        return (front == -1);
    }

    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println("Element are "+ arr[i]);
        }
    }
    
}

public class CircularQ1{
    public static void main(String[] args){
        Queue q1 = new Queue(3);

        q1.enqueue(21);
        q1.enqueue(32);
        q1.enqueue(22);
        q1.display();
    }

}
