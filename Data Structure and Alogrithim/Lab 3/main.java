package lab.pkg2.a.pkg2;

import java.util.Arrays;
import java.util.Scanner;
public class main {
public static void main(String[] args) {
    /*lab2 work*/ 
    /*   
TRAVERSING obj1 =new TRAVERSING();
obj1.traverse();*/

/*lab 3 work 1 calling */

    String[] array_name={"car","van","bike"};
    TRAVERSING obj1 =new TRAVERSING();
 Scanner input = new Scanner(System.in);
    obj1.traverse();
array_name=obj1.insert(array_name, "train");
for(String element:array_name){
    System.out.println(Arrays.toString(array_name));/*array_name.toString() is used to get hash values*/
}
           System.out.println("Enter the number you want to search:");
String j = input.next();
obj1.through_scanner(array_name, j);
        ;
}

}
