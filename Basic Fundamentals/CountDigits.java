// Count the number of digits in a number

public class CountDigits {
    
    public static void main(String[] args) {

        int n = 12345, count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

    }

}
