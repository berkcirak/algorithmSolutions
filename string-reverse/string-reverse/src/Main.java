import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String A = scan.next();

        if (isPalindrome(A)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}