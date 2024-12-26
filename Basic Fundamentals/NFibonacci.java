public class NFibonacci {
    
    public static void main(String[] args) {

        int n = 7;
        if (n <= 1) {
            System.out.println(n);
            return;
        }

        int curr = 0, prev1 = 1, prev2 = 0;

        for (int i = 2; i < n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println(curr);
        

        // <-------------------------- To N Number ---------------------->

        // int n = 7, a = 0, b = 1;
        // System.out.print(a + " " + b + " ");

        // for (int i = 2; i < n; i++) {
        //     int c = a + b;
        //     System.out.print(c + " ");
        //     a = b;
        //     b = c;
        // }

    }

}
