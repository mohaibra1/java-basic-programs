public class Fibonacci {

    //fibonacci without recursion

    public int[] fibonacci(int count){
        int f1 = 0;
        int f2 = 1;
        int[] arr = new int[count];
        arr[0] = f1;
        arr[1] = f2;

        for(int i = 2; i < count; i++){
           int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
          arr[i] = f3;
        }
        return arr;
    }
}
