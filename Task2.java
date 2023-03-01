import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину першого катета: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть довжину другого катета: ");
        double b = scanner.nextDouble();

        double c = Math.hypot(a, b);
        double angleA = Math.toDegrees(Math.asin(a / c));
        double angleB = Math.toDegrees(Math.asin(b / c));
        double angleC = 90;

        System.out.println("Кути прямокутного трикутника:");
        System.out.printf("A: %.2f градусів\n", angleA);
        System.out.printf("B: %.2f градусів\n", angleB);
        System.out.printf("C: %.2f градусів\n", angleC);
    }
}
