// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

         Fibonacci fib = new Fibonacci();

         int count = 10;

        System.out.println();

         for(int i = 0; i < count; i++ ){
             System.out.print(fib.fibonacci(count)[i] + " ");
         }
    }
}