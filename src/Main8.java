import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        int n = s.nextInt();
        for (int x = 0; x >= n;) {
            System.out.println("Проверьте вводимое значение. Является ли оно целым положительным числом?" + "\n" + "Введите число заново");
            n = s.nextInt();
        }
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
