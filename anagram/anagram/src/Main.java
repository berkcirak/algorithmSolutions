import java.util.Arrays;
import java.util.Scanner;

public class Main {


    static boolean isAnagram(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()){
            return false;
        }
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        Arrays.sort(aChars);
        Arrays.sort(bChars);

        return Arrays.equals(aChars, bChars);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        boolean result = isAnagram(a, b);
        System.out.println(result ? "Anagram" : "Not Anagram");

    }
}