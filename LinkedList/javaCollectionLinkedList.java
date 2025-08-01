import java.util.LinkedList;
public class javaCollectionLinkedList {
    public static void main(String[] args) {
        //create the linked list
        LinkedList<Integer>ll=new LinkedList<>();

        //add in linked list
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);

        System.out.println(ll);

        //remove in linked list
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
    
}
