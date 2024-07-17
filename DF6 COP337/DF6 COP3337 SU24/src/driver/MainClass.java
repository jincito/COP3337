package driver;

public class MainClass
{
    public static void main(String[] args){
        boolean[] flags = new boolean[] {false,false};
        try {
            if(flags[1] && Integer.parseInt("1.2") >= 1)//NumberFormatException
                System.out.println("Hello");
            else if(flags[2])//IndexOutOfBoundException
                System.out.println(1/0);//ArithmeticException
        }catch(NumberFormatException e) {
            System.out.println("first");
        }catch(ArithmeticException e) {
            System.out.println("second");
        }catch(IndexOutOfBoundsException e) {
            System.out.println("third");
        }catch(Throwable t) {
            System.out.println("fourth");
        }finally {
            System.out.println("fifth");
        }

        System.out.printf("%5d", 12);

        System.out.printf("**%-30.1f**", -1.55);

        System.out.printf("**%-10.7s**", "Good morning");

        System.out.printf("**%012.4e**", 2000000000000./3);

    }
}