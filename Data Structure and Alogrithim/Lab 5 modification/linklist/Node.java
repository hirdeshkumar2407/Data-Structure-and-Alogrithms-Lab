/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1812118_likedlist;


public class Node {
    int data;
    Node nextnode;
    public Node(int data){
       this.data = data; 
    }
    
    
    @Override
    public String toString(){
       return ""+data; 
    }
}
