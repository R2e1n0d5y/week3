package nilai;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nilai nilai = new Nilai(); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int inputNilai = scanner.nextInt();
        System.out.println("Grade: " + nilai.cekNilai(inputNilai));
        scanner.close();
    }
}
