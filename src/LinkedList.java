public class LinkedList implements Cloneable {  //make sure java can treat it as cloneable and allows access to tools to do so

    //2 objects - nodes (each element) and list (architecture that tracks beginning and end of list)
    //Node is inner class

    private Node head;
    private static int size;

    static class Node {
        int data;   //anything
        Node next;  //next node in list

        Node(int data) {     //constructor matches type of data
            this.data = data;
            next = null;    //at this point, nothing in the list so this is fine
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;        //new end of list

        if (list.head == null) {     //ie nothing in list at the moment
            list.head = newNode;    //create first entry in list
        }
        else {
            Node last = list.head;  //not the end, we're using it as a starting point for navigation
            while (last.next != null){
                last = last.next;      //when last = null, exit while loop...
            }
            last.next = newNode;    //...and assign new node
        }
        size++;
        return list;

    }

    public static void printList(LinkedList list){
        Node currentNode = list.head;
        System.out.println("LinkedList: ");
        while (currentNode != null){    //ie not at end of list
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }









    public boolean equals(Object o){          //every object in java is an object, which provides equals and toString, so needs to be overridden
        if (o == null){
            return false;       //equals being called from existing LinkedList - if null then nothing to compare so not equal
        }
        if (getClass() != o.getClass()){
            return false;       //if we have a LinkedList and a non LinkedList, they aren't equal
        }
        LinkedList other = (LinkedList) o;  //casting Object o to type LinkedList, gives access to public LinkedList methods
        if (size != other.size){
            return false;                   //o can now use size method of LinkedList, if they aren't equal in size, not equal.
        }
        Node nodeA = head;              //first list to compare
        Node nodeB = other.head;        //second to compare (one we added)
        while (nodeA != null){
            if (nodeA.data != nodeB.data){
                return false;           //the data doesn't match. So not equal.
            }
            nodeA = nodeA.next;
            nodeB = nodeB.next;         //iterate the nodes to the next values
        }
        return true;        //if it passes the above, they are the same! (same size, same class, same contents.
    }





    public LinkedList clone() throws CloneNotSupportedException{    //inherited from Object class
        LinkedList other = (LinkedList) super.clone();     //call clone method from superclass (Object)
        //must be cast to LinkedList as super.clone() returns Object (since the super is a clone)

        if (size > 0){          //if it was 0, we'd be done!
            other.head = new Node(head.data);       //data from original head added as head in clone
            Node nodeA = head.next;
            Node otherNode = other.head;

            while (nodeA != null){                  //while not at the end of the list
                Node newest = new Node(nodeA.data);
                otherNode.next = newest;
                nodeA = nodeA.next;
            }
        }
        return other;
    }
}
