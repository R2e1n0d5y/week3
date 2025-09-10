import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int num1 = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();
        System.out.println("Pilih operasi: 1. Tambah 2. Kurang 3. Kali 4. Bagi");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Hasil: " + kalkulator.tambah(num1, num2));
        } else if (choice == 2) {
            System.out.println("Hasil: " + kalkulator.kurang(num1, num2));
        } else if (choice == 3) {
            System.out.println("Hasil: " + kalkulator.kali(num1, num2));
        } else if (choice == 4) {
                System.out.println("Hasil: " + kalkulator.bagi(num1, num2));
        } else {
            System.out.println("Pilihan tidak valid.");
        }

    }
}
