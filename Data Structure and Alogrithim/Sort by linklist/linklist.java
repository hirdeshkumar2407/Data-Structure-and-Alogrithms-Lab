package link_list;
public class linklist {
  Node head;
Node tail;
int size=0;
public void add(String data,int data2){
Node node = new Node(data,data2);
{
if(tail==null)
{
head = node;
tail=node;
}
else{
tail.nextNode=node;
tail=node;
}
}

}
public void delete(String data){
Node temp=head;
        head=head.nextNode;
temp.nextNode=null;
}
public void traverse(){

if(head!=null)
{
Node node = head;
    System.out.println(node);
    while(node.nextNode!=null)
    {
        node =node.nextNode;
        System.out.println(node);
     
    }
}
}
public Node find(String data)  /*public Node is refence method. ALways check if head is equal*/

{
if(head ==null)
{
    return  null;

}
if(head.data.equals(data))
    
{
    return head;
}
Node node=head;
while(node.nextNode!=null)
{
node=node.nextNode;
if (node.data.equals(data)){
    
    return node;
}

}
return null;
}

public void reverse() {
    Node pointer = head;
    Node previous = null, current = null;

    while (pointer != null) {
      current = pointer;
      pointer = pointer.nextNode;

      // reverse the link
      current.nextNode = previous;
      previous = current;
      head = current;
    }
}
//sortList() will sort nodes of the list in ascending order
public void sortList()
        //if(name[i].compareTo(name[j])>0)
        
{
//Node current will point to head  
        Node current = head, index = null;  
        String temp;  
          int temp2;
        if(head == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                //Node index will point to node next to current  
                index = current.nextNode;  
                  
                while(index != null) {  
                    //If current node's data is greater than index's node data, swap the data between them  
                   if(current.data .compareTo(index.data)>0)
                   {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                        temp2 =current.data2;
                         current.data2 = index.data2;  
                        index.data2 = temp2;
                    }  
                    index = index.nextNode;  
                }  
                current = current.nextNode;  
            }      
        }  
}


}
