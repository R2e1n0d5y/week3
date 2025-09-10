package parkir;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int mobil = 3000;
        int motor = 2000;
        int TotalBiaya = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Biaya parkir mobil: " + mobil);
        System.out.println("Biaya parkir motor: " + motor);
        int hari;
        do {
            System.out.print("Masukkan jumlah hari parkir: ");
            hari = scanner.nextInt();
            if (hari < 0) {
                System.out.println("Jumlah hari tidak valid.");
                continue;
            } else {
                break;
            }
        }while (true);
        
        for (int i = 1; i <= hari; i++) {
            System.out.print("Hari ke-" + i + "(mobil/motor): ");
            String jenis = scanner.next();
            if (jenis.equals("mobil")) {
                TotalBiaya = TotalBiaya + mobil;
            } else if (jenis.equals("motor")){
                TotalBiaya = TotalBiaya + motor;
            } else {
                i--;
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }
        System.out.println("Total biaya parkir selama " + hari + " hari adalah: " + TotalBiaya);
    }

}
