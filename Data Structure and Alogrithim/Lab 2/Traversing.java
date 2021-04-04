
package LAB2A2;
public class Traversing 
{
    public void traverse()
    {
        String[] thisIsAStringArray = {"Apple","Banana","Orange"};
        System.out.println("Traversed Hardcore Array: ");
        for (int i=0; i<thisIsAStringArray.length;i++)
        {
            String element = thisIsAStringArray[i];
            System.out.print(" "+element);
        }
        
    }
}
