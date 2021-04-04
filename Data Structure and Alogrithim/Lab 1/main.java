
package LAB2A1;

import java.util.Scanner;

public class main 
{
    public static void main(String[] args) 
    {
//        int[] array_name = {5,6,7,8,9};
////        int array_name[];
//        System.out.println("Array Elements");
////        for (int i=0; i<=array_name.length-1; i++)
////        {
////            System.out.println(array_name[i]);
////        }
//        
//        for (int i=4; i<=array_name.length-1; i--)
//        {
//            System.out.println(array_name[i]);
//        }
//        
//        int x=10;
//        int flag=0;
//        for(int i=0; i<=array_name.length-1; i++)
//        {
//            if(array_name[i] == x)
//            {
//                flag=1;
//                break;
//            }
//            else{
//                flag=0;
//            }
//        }
//        if(flag==1){
//            System.out.println("Element Found");
//        }
//        else{
//            System.out.println("Element Not Found");
//        }
//        
////        System.out.println("Enter Elements to find: ");
//    }    
Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=input.nextInt();
        int array[]=new int[n]; 
        System.out.println("Enter the elements one by one:");
        for (int s=0;s<array.length;s++)
        {
            array[s]=input.nextInt();
        }
        System.out.println("Enter Value U Want To Match : ");
        
        for(int s=0;s<array.length;s++)
        {
        int choice=input.nextInt();
        if(choice==array[s]){
            System.out.println("Found");
            
        }
        else{
            System.out.println("Not found");
        }
        }
}
}
