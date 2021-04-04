package linked_list;
public class linklist {
  Node head;
Node tail;
int size=0;
public void add(int data){
Node node = new Node(data);
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
public void delete(int data){
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
public Node find(int data)  /*public Node is refence method. ALways check if head is equal*/

{
if(head ==null)
{
    return  null;

}
if(head.data==data)
    
{
    return head;
}
Node node=head;
while(node.nextNode!=null)
{
node=node.nextNode;
if (node.data==data){
    
    return node;
}

}
return null;
}

}
