package Arrays_Insert;
public class main 
{
    public static void main(String[] args) 
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Size Of An Array: ");
        int n = sc.nextInt();
        int[] array_name = new int[n+1];
        System.out.println("Enter Elements In Array: ");
        for(int i=0; i<n; i++)
        {
            array_name[i]=sc.nextInt();
        }
        System.out.println("Enter Element To Insert: ");
        int x = sc.nextInt();
        System.out.println("Enter Position To Insert Element(index number): ");
        int position = sc.nextInt();
        array_name[position] = x;
        for(int i=n; i>position; i--)
        {
            array_name[i] = array_name[i-1];
        }
        System.out.println("New Array Is: ");
        for(int i=0; i<=n; i++)
        {
            System.out.println(array_name[i]);
        }
    }    
}