/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistprac;

/**
 *
 * @author hp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Linklist obj = new  Linklist();
 obj.add(12);
 obj.add(24);
 obj.add(36);
 obj.add(48);
obj.add(64);
obj.traverse();
        System.out.println("Link list after deletion"); 
obj.delete(24);
obj.traverse();
        System.out.println("Reverse link list");
        obj.reverse();
        obj.traverse();
        System.out.println("Intsert at node 3");
        
        obj.insertatany(3, 128);
        obj.traverse();
        obj.reverse();
          obj.traverse();
          System.out.println("Now change head node data");
          obj.insertatstart(16);
          obj.traverse();
          System.out.println("Now add tail node data");
    obj.insertatend(10);
    obj.traverse();
        System.out.println("Delete 128");
obj.delete(128);
obj.traverse();
  System.out.println("Delete 12");
obj.delete(12);
obj.traverse();
  System.out.println("Delete 10");
obj.delete(10);
obj.traverse();
        System.out.println("Delete at start");
        obj.deleteatstart();
        obj.traverse();
        System.out.println("Delete at end");
        obj.deleteatend();
        obj.traverse();
        System.out.println("Now add random numbers");
        obj.insertatend(12);
        obj.insertatend(23);
        obj.insertatend(35);
        obj.traverse();
        System.out.println("Sorting");
        obj.sort();
        obj.sort();
        obj.sort();
        obj.traverse();
    }
    
}

