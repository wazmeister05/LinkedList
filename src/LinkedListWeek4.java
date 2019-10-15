public class LinkedListWeek4 {

    /*
        1.	Give an implementation of the size() method for the SingularlyLinkedList class,
                assuming that we did not maintain size as an instance variable.
        2.	Give an implementation of the size() method for the CircularlyLinkedList class,
                assuming that we did not maintain size as an instance variable.
        3.	Give an implementation of the size() method for the DoublyLinkedList class,
                assuming that we did not maintain size as an instance variable.
        4.	Implement a rotate() method in the SinglyLinkedList class,which has semantics equal to addLast(removeFirst()),
                yet without creating any new node.
     */

    public static void main(String[] args){
        SinglyLinkedList<String> sll = new SinglyLinkedList<>();
        CircularlLinkedList<String> cll = new CircularlLinkedList<>();
        DoublyLinkedList<String> dll = new DoublyLinkedList<>();

        sll.addFirst("one");
        sll.addLast("two");
        sll.addLast("three");
        sll.addLast("four");
        sll.addLast("five");
        sll.addLast("six");
        System.out.println(sll.sizeSLL());
        //doesn't work with empty list

        cll.addFirst("one");
        cll.addFirst("two");
        cll.addFirst("three");
        cll.addFirst("four");
        System.out.println(cll.sizeCLL());
        //doesn't work with empty list

        dll.addFirst("one");
        dll.addFirst("two");
        dll.addFirst("three");
        dll.addFirst("four");
        dll.addFirst("five");
        dll.addFirst("six");
        dll.addFirst("seven");
        dll.addFirst("eight");
        dll.addFirst("nine");
        System.out.println(dll.sizeDLL());
        //doesn't work
    }
}
