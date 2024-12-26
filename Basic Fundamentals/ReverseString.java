// Reverse a string without using built-in functions

public class ReverseString {

    public static void main(String[] args) {

        String str = "hello";
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }

        System.out.println("Reverse String: " + new String(chars));
    }

}
