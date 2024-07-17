import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class DF8pt2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        System.out.println("Initial state: " + list);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            it.next();
            if (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        System.out.println("After removing every other element: ");
        System.out.println("Forward Traversal: ");
        for (int number: list) {
            System.out.print(number + " ");
        }
        System.out.println("Backward Traversal: ");
        while(it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
    }
}
