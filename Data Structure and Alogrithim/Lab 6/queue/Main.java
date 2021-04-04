package queues;
import java.util.*;
public class Main {
    public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
        System.out.println("Array Queue Test\n");
         System.out.println("Enter Size of Integer Queue \n");
         int n = scan.nextInt();
         queue_arr q = new queue_arr(n);
         
    System.out.println("Enqueue Element in Queue: ");
    try
    {
    
    for(int i=0; i<n ;i++)
        
        q.insert(scan.nextInt());
    } 
        
   catch(Exception e)
   {
       System.out.println("Error: " +e.getMessage());
   }
    
        System.out.println("Dequeue element from queue: ");
        try
        {
        
        for (int i =0; i<n;i++)
        {
        q.remove();
        }
        }
        catch(Exception e)
        {
                   System.out.println("Error: " +e.getMessage());

        }
        System.out.println("\n Empty status = "+q.isEmpty());
    }
    
}