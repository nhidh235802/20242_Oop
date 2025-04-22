import java.util.Arrays;
import java.util.Scanner;

public class B6_5 {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = arr.nextInt();

        int[] numbers = new int[n];

        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            numbers[i] = arr.nextInt();
        }

        Arrays.sort(numbers);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / n;

        System.out.print("Day sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Tong: " + sum);
        System.out.println("Trung binh: " + average);
    }
}
