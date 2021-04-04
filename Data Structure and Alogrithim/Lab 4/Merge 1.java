package Arrays_Merge;
import java.util.Arrays;
public class main 
{
    public static void main(String[] args) 
    {
        int[] array_1 = {1,2,3,4,5};
        int[] array_2 = {6,7,8,9,10};
        int length = array_1.length + array_2.length;
        int[] merge_array = new int[length];
        int position = 0;
        for(int element : array_1)
        {
            merge_array[position] = element;
            position++;
        }
        for(int element : array_2)
        {
            merge_array[position] = element;
            position++;
        }                
        System.out.println(Arrays.toString(merge_array));
    }
}