import java.util.Scanner;

public class bai03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính: ");
        double r = scanner.nextDouble();

        double pi = 3.14;
        double dienTich = pi * r * r;

        System.out.println("Diện tích: " + dienTich);

        scanner.close();
    }
}