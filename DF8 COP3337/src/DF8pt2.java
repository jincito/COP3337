//Jin Carballosa
//COP3337 DF8

//5. Write a java program that:
//
//        First, stores numbers from 1,2, ..., 100 in a LinkedList<Integer> object.
//        Then, removes every other element (2, 4, 6, ..., 100) in the linked list (use ListIterator.remove method).
//        Finally, print the resulting linked list on console twice: first time, print it increasingly (1, 3, ..., 99) and second time, print it decreasingly (99, 97, ..., 1).

import java.util.*;

public class DF8pt2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        printListForward(list);

        ListIterator<Integer> iteratorEven = list.listIterator(0);
        while(iteratorEven.hasNext()){
            int num = iteratorEven.next();
            if(num % 2 == 0){
                iteratorEven.remove();
            }
        }

        printListForward(list);
        printListReverse(list);
    }

    public static void printListForward(LinkedList<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printListReverse(LinkedList<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            int num = iterator.previous();
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
