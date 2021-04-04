package bstprac;
public class BST {
 public Node createNewNode(int dat)
 {
 Node a =new Node();
 a.data=dat;
 a.left=null;
 a.right=null;
 return a;
 }
public Node insert(Node node,int val)
{
if(node==null)
{
return createNewNode(val);
}
if(val<node.data)
{
node.left=insert(node.left,val);
}
else if(val>node.data)
{
node.right=insert(node.right,val);
        
}
return node;
}
public void preorder(Node root)
{
if(root==null)
{
return;
}
    System.out.println(root.data +" ");
    preorder(root.left);
    preorder(root.right);
}
public void inorder(Node root)
        
{
if(root==null)
{
    return;
}  
inorder(root.left);
    System.out.println(root.data);
inorder(root.right);
}
public void postorder (Node root)
{
if(root==null)
{
return;
}
postorder(root.left);
System.out.println(root.data+ " ");
postorder(root.right);
    
}
public void search(Node root,int key)
{
    try{
    
    boolean flag=false;
Node ptr =root;


if(ptr==null)
{
    System.out.println("No data");
}
else
{
while(ptr!=null && ptr.data!=key)
    
{
    

    
  if(key>ptr.data)
 {
 ptr=ptr.right;
 
 }
if(key<ptr.data)
     
 {
 ptr=ptr.left;
  }
}
}

 if(ptr.data==key)
 {
 flag=true;
  }
    if(flag==true)
{
    System.out.println("Data found");
}
else{
    System.out.println("Data not found");
}

}
catch(Exception e)
{
    System.out.println("Data not found");
} 
}
public int countTotalNode(Node node)
{
if(node==null)
{
return 0;
}
else{
int counter =1;
counter += countTotalNode(node.left);
counter += countTotalNode(node.right);
return counter;

}
}

public int countTotalLeftNode (Node node)
{
if(node==null)
{
return 0;

}
else{

int counter=1;
counter +=  countTotalLeftNode(node.left);
return counter;
}
}
public int countTotalRightNode (Node node)
{
if (node==null)
{
return 0;
}
else{
int counter=1;
counter += countTotalRightNode(node.right);
        return counter;

}

}
public void delete1(Node node,int key){ //deletion of the leaf node
  Node ptr =node;
  boolean flag =false;
  Node parent=node;
  try{
if(ptr==null)
        
        {
            System.out.println("Data not availible for deletion");
        }
else{
      while(ptr!=null&&ptr.data!=key)
{
if(key>ptr.data)
{
parent=ptr;
    ptr=ptr.right;

}
if(key<ptr.data)
{
parent=ptr;
    ptr=ptr.left;
}
}


}
if(ptr.data==key)
{
flag=true;
    
}

if(flag==true)
{
    System.out.println("Data found for deletion");
}
else{
System.out.println("Data not found for deletion");
}
  }
catch(Exception e)
{
    System.out.println("Data not present for deletion");
}

 if(ptr.left==null &&ptr.right==null) 
  {
 if(parent.left==ptr)
 {
 parent.left=null;
 }
 else{
 parent.right=null;
     
 }
  }
}
 public void delete2(Node node, int key)//Delete only child 
 {
     boolean flag = false;
 Node ptr=node;
 Node parent=node;
 
     try {

 if(ptr==null)
     
 {
   System.out.println("Data not availible for deletion");
 
 }
 else
 {
     
 while(ptr!=null&&ptr.data!=key)
 {
 if(key>ptr.data)
 {
     parent=ptr;
 ptr=ptr.right;
 }
 if (key<ptr.data)
 {
  parent=ptr;
 ptr=ptr.left;
 }
     
 }
 }
 if(ptr.data==key)
 {
 flag=true;
 }
 
 if(flag==true)
 {
     System.out.println("Data present in deletion:");
 }
 else{
 
  System.out.println("Data not present in deletion:");
 }
 }
 
 catch(Exception e)
 {
 System.out.println("Data not present for deletion");
 }
 
 if(ptr.left!=null||ptr.right!=null)
 {
  if(parent.left==ptr){
  if(ptr.left==null)
  {
  parent.left=ptr.right;
  }
  else{
  parent.left=ptr.left;
  }
  
  
  }
  else{
  if(parent.right==ptr)
  {
  if(ptr.right==null)
  {
  parent.right=ptr.left;
  }
  else{
  parent.right=ptr.right;
  }
  
  
  }
  
  }
     
 }
 }


public void delete3(Node node, int key) {//Delete with two child
        boolean flag=true;
        Node ptr=node;
        Node parent=node;
        try{
        if(ptr==null)
        {
           System.out.println("Data not present for deletion");
        }
        else
        {
        while(ptr!=null&&ptr.data!=key)
        
        
        {
        if(key>ptr.data)
        {
        parent=ptr;
        ptr=ptr.right;
        }
        if(key<ptr.data)
        {
        parent=ptr;
        ptr=ptr.left;
        }
        
        }
        
        
        }   
        if(ptr.data==key){    
        flag=true;
        }
         if(flag==true)
 {
     System.out.println("Data present in deletion");
 }
 else{
 
  System.out.println("Data not present in deletion:");
 }    
        }
        
       catch(Exception e) {
       System.out.println("Data not present for deletion");
       } 
    
   if(ptr.right!=null&&ptr.left!=null)
   {
  Node successor	 = getSuccessor(ptr);
			if(ptr==node){
				node = successor;
			}else if(node.left!=null){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = ptr.left;
   }

   }


public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		//check if successor has the right child, it cannot have left child for sure
		// if it does have the right child, add it to the left of successorParent.
//		successsorParent
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
}
