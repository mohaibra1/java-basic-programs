public class PrimeNumber {

    public static boolean primeNum(int prime){
        if(prime <= 1){
            return false;
        }

        for(int i = 2; i <= prime/2; i++){
            if(prime % i == 0){
                System.out.println(prime + " is not a prime number!");
                return false;
            }
        }
        System.out.println(prime + " is a prime number");
        return true;
    }
}
