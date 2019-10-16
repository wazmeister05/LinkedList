
public class LinkedListApp {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = list.insert(list, 1);        //override initial list every time we insert something
        list = list.insert(list, 2);        //override initial list every time we insert something
        list = list.insert(list, 3);        //override initial list every time we insert something
        list = list.insert(list, 55);        //override initial list every time we insert something
        list = list.insert(list, 71);        //override initial list every time we insert something
        list = list.insert(list, 1122);        //override initial list every time we insert something
        list = list.insert(list, 15);        //override initial list every time we insert something

        list.printList(list);
    }
}
