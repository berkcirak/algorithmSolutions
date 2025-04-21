import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        if (s.trim().isEmpty()){
            System.out.println(0);
            return;
        }
        String[] tokens = s.trim().split("[^a-zA-Z]+");
        System.out.println(tokens.length);
        for (String token: tokens){
            System.out.println(token);
        }
    }
}