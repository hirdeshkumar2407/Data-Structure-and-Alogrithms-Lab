/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link_list;

/**
 *
 * @author hp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        linklist obj =new linklist();
        System.out.println("Before sort:");
      obj.add("USAMA",21);
      obj.add("ELLIOTT",15);
obj.add("MALIK",18);

obj.add("HIRDESH",24);
obj.traverse();
obj.sortList();

        System.out.println("After sort:");
obj.traverse();
    }
    
}
