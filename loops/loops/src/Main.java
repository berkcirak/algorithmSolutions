import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();
        for (int i=0; i<q; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int term = a;
            for (int j=0; j<n; j++){
                term += Math.pow(2,j) * b;
                System.out.printf(term + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}