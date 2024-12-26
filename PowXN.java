public class PowXN {

    public static double power(double x, int n) {
        if (n == 0) return 1.0;
        if (x == 0) return 0.0;
        if (x == 1) return 1.0;
        if (x == -1 && n % 2 == 0) return 1.0;
        if (x == -1 && n % 2 != 0) return -1.0;

        long binForm = n;
        double ans = 1;

        while (n < 0) {
            x = 1/x;
            binForm = -binForm;
        }

        while (binForm > 0) {
            if (binForm % 2 == 1) {
                ans *= x;
            }

            x *= x;
            binForm /= 2;
        }

        return ans;
    }
    
    public static void main(String[] args) {
        
        double x = 2.10000;
        int n = 3;

        double result = power(x, n);
        System.out.println(result);

    }

}
