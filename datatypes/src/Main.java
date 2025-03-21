import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < T; i++){
            String value = scan.nextLine();

            try {
                long n = Long.parseLong(value);
                System.out.println(value + " can be fitted in");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n<= Integer.MAX_VALUE)
                    System.out.println("* int");
                System.out.println("* long");
            } catch (NumberFormatException e){
                System.out.println(value + " can't be fitted anywhere");
            }

        }
        scan.close();


    }
}