
package pkg1812118_likedlist;

public class Main {

    public static void main(String[] args) {
        linklist list = new linklist();
        list.add(15);
        list.add(16);
        list.add(10);
        list.traverse();
        System.out.println("10 exist?"+list.find(10)); 
        System.out.println("16 exist?"+list.find(16));
        System.out.println("15 exist?"+list.find(15));
        System.out.println("22 exist?"+list.find(22));
       // list.delete_at_end(10);
       list.delete_at_specific_position(10);
        System.out.println("10 exist?"+list.find(10)); 
        System.out.println("16 exist?"+list.find(16));
        System.out.println("15 exist?"+list.find(15));
        
       /* list.delete(15);
         System.out.println("10 exist?"+list.find(10)); 
        System.out.println("16 exist?"+list.find(16));
        System.out.println("15 exist?"+list.find(15));
        System.out.println("22 exist?"+list.find(22));*/
       
    }
    
}
