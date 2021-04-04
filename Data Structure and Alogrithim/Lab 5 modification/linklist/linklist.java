
package pkg1812118_likedlist;


public class linklist {
    Node head;
    Node tail;
    
    public void add(int data){
        Node node = new Node(data);
        if(head/*tail*/ == null){
            head = node;
            tail = node;
        }
        else {
            tail.nextnode = node;
            tail = node;
        }
    }
    
    public void traverse(){
        if(head!= null){
            Node node = head;
            System.out.println(node);
            while(node.nextnode != null){
              node = node.nextnode;
              System.out.println(node);
        }
        }
    }
    
    public Node find (int data){
        if(head==null)
            return null;
        if(head.data == data)
            return head;
        
        Node node = head;
        while(node.nextnode!= null){
            node = node.nextnode;
            if(node.data == data)
                return node;
        }
        return null;
    }
    
    public void delete(int data){
        Node temp = head;
        head = head.nextnode;
        temp.nextnode = null;
    }
    
   public void delete_at_end(int data){
       
       if(head == null)
           System.out.println("List is empty");
       else if(head!= null){
           Node p = head;
           Node q = head.nextnode;
           while(q.nextnode!= null){
               p = p.nextnode;
               q = q.nextnode;
           }
           p.nextnode = null;
       }
   } 
      public void delete_at_specific_position(int data){
          
          if(head == null)
           System.out.println("List is empty");
          else if(head!= null){
           Node p = head;
           Node q = head.nextnode;
           if(head.data == data){
             head = head.nextnode; 
             p.nextnode = null;
           }
           else{
           while(q.data!= data){
               p = p.nextnode;
               q = q.nextnode;
           }}
           p.nextnode = q.nextnode;
      }
       
   }
}

