package Examples;

public class Part2DF7 {
        public static void g(int n, int b){
            if(n < b) // base case
                System.out.print(n);
            else { // recursive step
                g(n/b, b);//line 7
                System.out.print(n%b);//line 6
            }
        }

        public static void main(String[] args){
            g(85649, 10);
        }
}