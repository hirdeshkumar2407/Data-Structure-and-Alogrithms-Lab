package link_list;
public class Node {
String data;
int data2;
Node nextNode; /*address of next node ; Class variable*/
public Node(String data,int data2){
    this.data=data;
    this.data2=data2;
}
public String toString()
{
return "Name:" +data +" Age:"+data2;
}
}
