// Count vowels and consonants in a string

public class CountVowelAndConso {
    
    public static void main(String[] args) {
        
        String str = "Hello world";
        int vowels = 0, consonants = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeious".indexOf(c) >= 0) vowels++;
            else if (Character.isLetter(c)) consonants++;
        }

        System.out.println("vowels : " + vowels + " consonants : " + consonants);

    }

}
