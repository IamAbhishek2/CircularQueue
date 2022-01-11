 class CircularQ {

    int arr[];
    int size;
    int front =-1, rear =-1;

    public CircularQ(int size){
        this.size = size;
        arr = new int[size];
    }
    
    void enqueue(int data){
        if((rear+1)%size == front){
            return;
        }
        if(front ==-1){
            front=0;   
        }
        rear = (rear+1)%size;
        arr[rear]=data;
    }

    int dequeue(){

        if(front==-1){
            return -1;
        }
        int result = arr[front];
        if(front == rear){
            front = rear =-1;
        }
        else{
            front = (front+1)%size;
        }
        return result;
    }

    int front(){
        if((rear+1)%size == front){
            return -1;
        }
        if(front ==-1){
            front=0;   
        }
        return arr[front];
    }

    void display(){
        for(int i =0;i<arr.length;i++){
            System.out.println("Element in array "+arr[i]);
        }
    }
}

public class CircularQueue{
    public static void main(String[] args){
        CircularQ q = new CircularQ(3);

        q.enqueue(3);
        q.display();
    }
}
