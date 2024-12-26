public class PrimeNumber {

    public static void main(String[] args) {
        int n = 35;

        System.out.println("Prime numbers up to " + n + ":");

        for (int i = 2; i < n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean checkPrime(int n) {
        if (n < 2) {                              // 0 and 1 are not prime numbers
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
