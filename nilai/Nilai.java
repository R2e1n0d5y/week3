package nilai;

public class Nilai {
    public String cekNilai(int nilai) {
        if (nilai >= 85 && nilai <= 100) {
            return "A";
        } else if (nilai >= 70 && nilai < 85) {
            return "B";
        } else if (nilai >= 60 && nilai < 70) {
            return "C";
        } else if (nilai >= 50 && nilai < 60) {
            return "D";
        } else if (nilai >= 0 && nilai < 50) {
            return "E";
        } else {
            return "Nilai tidak valid";
        }
    }
}
