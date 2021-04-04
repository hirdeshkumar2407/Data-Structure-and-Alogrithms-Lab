package lab.pkg2.a.pkg2;

import static jdk.nashorn.tools.ShellFunctions.input;
import java.util.Scanner;
public class TRAVERSING {
int flag =0;
    public void traverse(){
    String [] thisIsAStringArray = {"Apple", "Banana", "Orange"};
        System.out.println("Traversed Hardcode Array:");
        for(int i=0; i<thisIsAStringArray.length;i++)
        {
            String element = thisIsAStringArray[i];
            System.out.print(" " + element + " , ");
            }
    }
    /*Lab3 work*/
public String[] insert(String[] originalArray,String newItem){
int currentSize=originalArray.length;
int newSize=currentSize+1;
String[] tempArray = new String[newSize];
for(int i =0;i<currentSize;i++)
{
tempArray[i]=originalArray[i];
}

tempArray[newSize-1]=newItem;
return tempArray;

}
public void through_scanner(String [] array_name2,String y){
 
    
    
 
   
   
    for(int i=0;i<array_name2.length;i++)
    {
    
    if (array_name2[i].equalsIgnoreCase(y))
    {
        flag =1;
        break;
        }
    else
    {
    flag=0;
    }
    
    
    
    }
    if (flag==1)
    { 
        System.out.println("Your entered string is in the list.");
    }    
     if (flag==0)
    {
        System.out.println("Your entered string is not in the list.");
    } 
}

        }
 
