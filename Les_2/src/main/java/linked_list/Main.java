package linked_list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.add("LADA");
        singlyLinkedList.add("Zhiguli");
        singlyLinkedList.add("Kopeika");
        singlyLinkedList.add("VESTA");

        System.out.println(singlyLinkedList);

        singlyLinkedList.remove("VESTA");
        System.out.println(singlyLinkedList);
        singlyLinkedList.find("LADA");
    }
}
