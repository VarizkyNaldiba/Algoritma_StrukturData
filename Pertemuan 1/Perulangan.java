import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double NIM;

        System.out.print("Masukkan NIM: ");
        NIM = input.nextDouble();

        double duadigit = NIM;
        double digit = duadigit % 100;
        System.out.println("n = " + digit);

        for (int i = 1; i <= digit; i++) {
            if (i == 6 && i == 10) {
                continue;
            } else {
                if (i % 2 == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" * ");
                }
            }

        }

        input.close();
    }
}