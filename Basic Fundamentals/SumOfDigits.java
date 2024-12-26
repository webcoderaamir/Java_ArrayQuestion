// Find the sum of digits of a number

public class SumOfDigits {
    
    public static void main(String[] args) {
        
        int n = 12345, sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println("Sum of digits: " + sum);

    }

}
