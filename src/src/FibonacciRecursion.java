public class FibonacciRecursion {
    int f1 = 0;
    int f2 = 1;
    int f3 = 0;

    public void fiboRecursion(int count){

        if(count > 0){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(" "+ f3);
            fiboRecursion(count -1);
        }

    }
}
