import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        int total = A.length()+B.length();

        String a = A.substring(0,1);
        String b = B.substring(0,1);
        String c = A.substring(1,A.length());
        String d = B.substring(1, B.length());
        System.out.println(total);

        if (A.compareTo(B) > 0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        System.out.println(a.toUpperCase()+c+" "+b.toUpperCase()+d);
    }
}