package linked_list;
public class main {
    public static void main(String[] args) {
linklist obj =new linklist();
obj.add(15);
obj.add(16);
obj.add(10);
obj.traverse();
obj.delete(15);

        System.out.println("16 is in list ?"+obj.find(16));
      System.out.println("22 is in list ?"+obj.find(22));
obj.traverse();
obj.reverse();
obj.traverse();
    }
    
}
