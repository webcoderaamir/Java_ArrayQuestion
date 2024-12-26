public class CheckStringPalindrome {

    public static void main(String[] args) {

        String str = "radar";

        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(left++) != str.charAt(right--)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("String isPalindrome: " + isPalindrome);

    }

}
