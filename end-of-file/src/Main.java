import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = 1;

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(n + " " + line);
            n++;
        }




    }
}