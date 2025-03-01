import java.util.Scanner;

public class B6_3{
    public static void main(String[] args) {
        Scanner keyboard = new  Scanner(System.in);
        System.out.println("Nhap chieu cao cua tam giac:");
        int n = keyboard.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}