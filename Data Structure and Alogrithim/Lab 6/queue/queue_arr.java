package queues;

import java.util.NoSuchElementException;

public class queue_arr {
int [] queue;
int front,rear,size,len;
    public queue_arr(int n){
        
     size =n;
     len =0;
     queue= new int[size];
     front =-1;
     rear=-1;
    }
public boolean isEmpty()
{
return front ==-1;

}
public boolean isFull()

{
return front==0 && rear==size -1;
}
    public int getSize()
   {
    return len;
    }
public void insert(int i){
if(rear==-1)
{
    front=0;
    rear=0;
    queue[rear]=i;
}
else if(rear + 1 >= size)
{
throw new IndexOutOfBoundsException("Overflow Exception");
}
else if(rear+1 < size)
{
queue[++rear]=i;
len++;
        
}

    
}

public int remove()
{

if(isEmpty())
throw new NoSuchElementException("Underflow Exception++");
else{
 len--;
 int ele=queue[front];
 if (front == rear)
 {
 front =-1;
 rear=-1;
        
 }     
 else     
front++;
return ele;
}

}
public void display()
{
    System.out.println("\nQueue = ");
    if(len==0)
    {
        System.out.println("Empty\n");
    return ;
    }
  for(int i=front;i<=rear;i++) 
  {
      System.out.println(queue[i]+" ");
      System.out.println();
  }
}


}
