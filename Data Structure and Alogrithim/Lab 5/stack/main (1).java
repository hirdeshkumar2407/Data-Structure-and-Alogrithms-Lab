package stack;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer Stack ");
        int n =scan.nextInt();
        System.out.println("Push Elements in Stack");
        stack_array obj = new stack_array(n);
        for(int i =0; i<n; i++)
        {
        obj.push(scan.nextInt());
        }
        obj.display();
        System.out.println("Pop from Stack");
        for(int i=0;i<n;i++){
        obj.pop();
        }
        obj.display();
        obj.pop();
    }
    
}
