import java.util.Scanner;

public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[3];
        for (int i=0; i < 3; i++) {
            numbers[i] = Integer.valueOf(scan.nextLine());
        }

        for (int i=0; i < 3; i++) {
            System.out.println(numbers[i]);
        }

        scan.close();
    }
}
