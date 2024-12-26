public class CheckNisPrime {
    
    public static void main(String[] args) {
        
        int n = 21;
        boolean isPrime = n > 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime? n + " is a prime number" : n + " is not a prime number");
    }

}
