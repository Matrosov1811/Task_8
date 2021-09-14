import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int n = (int) Double.parseDouble(s.next()
                .replace("-","")
                .replace(",","."));
        int sum = 0;
        for (int i = 1; i < n; i = i + 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
