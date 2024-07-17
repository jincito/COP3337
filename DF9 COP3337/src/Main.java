import java.util.*;
public class Main{
    public static void main(String []args){
        Queue <Integer> q = new LinkedList<>(); // Start debugging here
        int [] data = new int[] {5, 4, 6, 3, 2, 9, 13};
        for (int i = 0; i < data.length; i++){
            q.add(data[i++]);
            if (i < data.length)
                q.add(data[i]);
            System.out.print(q.remove() + "," );
        }
        while(!q.isEmpty())
            System.out.print(q.remove()+".");
    }
}