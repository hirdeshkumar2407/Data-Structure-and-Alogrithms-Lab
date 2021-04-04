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
public class Linklist {
Node head;
Node tail;
public void delete(int data)
        
{
Node p=head;
Node q=head.nextNode;
if(head.data==data)
{
head=q;
}
else{
while(p.nextNode.data!=data)
{
p=p.nextNode;
q=q.nextNode;
}
p.nextNode=q.nextNode;
}
}
public void add(int data)
{
Node node = new Node(data);
if (head == null)
{
head =node;
tail=node;
}
else
{
tail.nextNode=node;
tail=node;

}

} 

public void search(int data){
    int i=1;   
    if (head==null)
        {
        
            System.out.println("Head is null");
        }
        if (head.data==data)
        {
System.out.println("Data found in head node:" + data);
        }
        else{
            Node node =head;
        while(node.nextNode.data!=data)
        {
        node=node.nextNode;
        i++;
                
        }
        
        }
       System.out.println("Data found in node number " +i + " node:" + data); 
            }


public void traverse()
        
{
if (head==null)
{
    System.out.println("Linklist is empty");
    

}

else{
    Node node=head;
    System.out.println(node);
    while(node.nextNode!=null)
    {
    node=node.nextNode;
        System.out.println(node);
    }
    
    
}}


public void reverse()
{
Node ptr=head;
Node current=null;
Node previous=null;
while(ptr!=null)
{
    current = ptr;
    ptr = ptr.nextNode;
    
    current.nextNode=previous;
    previous=current;
    head=current;


}




}

public void insertatany(int pos, int data)
{
Node node = new Node(data);
int u=0;
Node p =head;
while(u<pos-2)
{
p=p.nextNode;
u++;
}
node.nextNode=p.nextNode;
p.nextNode=node;

    
    }
public void insertatstart(int data)
{
Node node =new Node(data);
Node p=head.nextNode;
if(head!=null)
{
node.nextNode=p;
head.nextNode=node;
}


}


public void insertatend(int data)
{
Node node =new Node(data);
Node p=head;
while(p.nextNode!=null)
{
p=p.nextNode;
}
p.nextNode=node;
node.nextNode=null;


}
public void deleteatstart()
{

Node p = head;
head=head.nextNode;
}
public void deleteatend()
{

Node p = head;
Node q= head.nextNode;
while(q.nextNode!=null)
{
    p=p.nextNode;
    q=q.nextNode;
}
p.nextNode=q.nextNode;
    }
public void sort()
{
Node p,q;
p=head;
q=null;
int temp;
while(p!=null)
{
q=p.nextNode;
while(q!=null)
{

if(p.data>q.data)
{
temp=p.data;
p.data=q.data;
q.data=temp;

}
 q=q.nextNode;
}
p=p.nextNode;
}

}
}
