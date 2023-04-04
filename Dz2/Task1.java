import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите чётное число n - длину строки: ");
            n = read.nextInt();
        } while(n <= 0 || n % 2 == 1);
        read = new Scanner(System.in);
        System.out.print("Ведите символ c1: ");
        char c1 = read.nextLine().charAt(0);
        System.out.print("Ведите символ c2: ");
        char c2 = read.nextLine().charAt(0);
        System.out.print(buildString(n, c1, c2));
    }
    private static String buildString(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < n / 2; count++) {
            sb.append(c1).append(c2);
        }
        return String.valueOf((sb));
    }
}
