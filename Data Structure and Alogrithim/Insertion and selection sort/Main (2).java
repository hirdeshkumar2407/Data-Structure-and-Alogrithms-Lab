package pkg1812114_sorting;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int[] arr ={5,4,1,2};
        System.out.println("Insertion Sort");
       sort1(arr);
        System.out.println( Arrays.toString(arr));
    
        System.out.println("Selection sort");
        sort_sel(arr);
        System.out.println( Arrays.toString(arr));
        System.out.println();
    }
    

//insertion method
    //array int 
    public static int sort1(int arr[])
    {
    for(int j=1; j<arr.length;j++)
    {
    int key = arr[j];
    int i = j-1;
    while(i>=0 && arr[i]>key)
    {
    arr[i+1] =arr[i];
    i=i-1;;
    }
    arr[i+1] =key;
    
    }
    
    
    
    return 0;
    }
//selection sort
public static int sort_sel(int arr[])
{
    
for(int i=0;i<arr.length;i++)
{
    
    
 int min_idx=i;
 for(int j=i+1;j<arr.length;j++)
    if(arr[j]<arr[min_idx])
    min_idx=j;
 int temp = arr[min_idx];
 arr[min_idx]=arr[i];
 arr[i]=temp;

}
return 0;

}

}