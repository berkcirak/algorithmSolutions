import java.util.Scanner;

public class Main {

    static int B;
    static int H;
    static boolean isValid = true;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if(B <= 0 || H <= 0){
            isValid = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }


    public static void main(String[] args) {
        if (isValid = true){
            int value = B*H;
            System.out.println(value);
        }

    }
}