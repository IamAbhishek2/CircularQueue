class MyCircularQueue {
    
    int arr[];
    int head;
    int tail;
    int size;

    public MyCircularQueue(int k) {
        
        arr = new int[k+1];   
        head = 0;
        tail = 0;
        size = k+1;
        
    }
    
    public boolean enQueue(int value) {
        
        if(isFull()){
            return false;
        }
        tail =(tail+1)%size;
        arr[tail]=value;
        return true;
        
    }
    
    public boolean deQueue() {
        
        if(!isEmpty()){
            head = (head+1)%size;
            arr[head] = 0;
            return true;
        }
        
        return false;
        
    }
    
    public int Front() {
        
        if(!isEmpty()){
            return arr[(head+1)%size];
        }
        
        return -1;
        
    }
    
    public int Rear() {
        
        if(!isEmpty()){
            return arr[tail];
        }
            
        return -1;
        
    }
    
    public boolean isEmpty() {
        
        return (head==tail);
        
    }
    
    public boolean isFull() {
        return ((tail+1)%size == head);
    }
}





public class CQ {
    public static void main(String[] args){
        
    }    
}
