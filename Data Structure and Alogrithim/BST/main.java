/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstprac;
import java.util.*;
/**
 *
 * @author hp
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws NullPointerException {
        BST a = new BST();
        Node root=null;
      /*  root =a.insert(root, 2);
        root=a.insert(root, 4);
        root=a.insert(root, 0);
        root=a.insert(root, 7);
        root=a.insert(root, 1);
        root=a.insert(root, 9);
        root=a.insert(root, 8);
        System.out.println("------ Preorder traversal --------");
        a.preorder(root);
        System.out.println("----------------------------------");
         System.out.println("------ Inorder traversal --------");
        a.inorder(root);
        System.out.println("----------------------------------");
    
    System.out.println("------ Postorder traversal --------");
        a.postorder(root);
        System.out.println("----------------------------------");
        System.out.println("Now search 8 in the BST");
        a.search(root, 8);
        System.out.println("Now search 5 in the BST");
        a.search(root, 5);
        System.out.println("Check the total number of nodes");
        System.out.println(a.countTotalNode(root));
          System.out.println("Check the total number of left nodes");
        System.out.println(a.countTotalLeftNode(root));
          System.out.println("Check the total number of right nodes");
        System.out.println(a.countTotalRightNode(root));
        */
   /* 
        System.out.println(" Deletion 1");
      root =a.insert(root,35);
       root =a.insert(root,20);
        root =a.insert(root,45);
         root =a.insert(root,16);
          root =a.insert(root,29);
           root =a.insert(root,42);
            root =a.insert(root,24);
             root =a.insert(root,33);
             root =a.insert(root,27);
             System.out.println("Pre order");
             a.preorder(root);
             System.out.println("--------------------");
             System.out.println(" Leaf node 27");
             a.delete1(root, 27);
              System.out.println("Pre order");
             a.preorder(root);
             System.out.println("--------------------");*/
    
     /*ystem.out.println("                  Deletion 2   ");
          root =a.insert(root,35);
       root =a.insert(root,20);
        root =a.insert(root,45);
         root =a.insert(root,16);
          root =a.insert(root,29);
           root =a.insert(root,42);
            root =a.insert(root,24);
             root =a.insert(root,33);
             root =a.insert(root,27);
        a.preorder(root);
             System.out.println("Delete 45");
             a.delete2(root, 45);

    
         System.out.println("Pre order");
             a.preorder(root);
             System.out.println("--------------------");*/
 /*System.out.println("                  Deletion 3   ");
          root =a.insert(root,35);
       root =a.insert(root,20);
        root =a.insert(root,45);
         root =a.insert(root,16);
          root =a.insert(root,29);
           root =a.insert(root,42);
            root =a.insert(root,24);
             root =a.insert(root,33);
             root =a.insert(root,27);
             a.preorder(root);
        System.out.println("Delete 20");
             a.delete3(root, 20);

    */
         System.out.println("Pre order");
             a.preorder(root);
             System.out.println("--------------------"); 
    }
    
}
