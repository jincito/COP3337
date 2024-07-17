import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class DF8 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < 5; i++)
            numbers.add(i);
        ListIterator<Integer> it = numbers.listIterator();
        while (it.hasNext())
            System.out.print(it.next() + (it.hasNext() ? " -> " : "\n")); // prints content and checks if there is more before printing an arrow
        while (it.hasPrevious()) {
            it.previous();
            if (it.hasPrevious()) {
                it.previous();
                it.remove();
            }
        }
        int count = 1;
        for (int number : numbers)
            System.out.print(count + ": " + number + (count++ < numbers.size() ? " -> " : ""));
    }
}