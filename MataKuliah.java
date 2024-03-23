import java.util.*;

public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int nilaiAngka;
    private String nilaiHuruf;

    public MataKuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }

    public void setNilaiHuruf(int nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
        // konversi nilai angka ke nilai huruf (contoh sederhana)
        if (nilaiAngka >= 80) {
            this.nilaiHuruf = "A";
        } else if (nilaiAngka >= 60) {
            this.nilaiHuruf = "B";
        } else if (nilaiAngka >= 50) {
            this.nilaiHuruf = "C";
        } else if (nilaiAngka >= 40) {
            this.nilaiHuruf = "D";
        } else {
            this.nilaiHuruf = "E";
        }
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }
}