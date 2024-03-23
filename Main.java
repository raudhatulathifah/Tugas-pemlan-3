// Nama : raudhatul athifah
// Kelas : SI-A
// NIM : 235150407111010

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nim, nama);

        boolean tambahMataKuliah = true;
        while (tambahMataKuliah) {
            System.out.print("Masukkan kode mata kuliah: ");
            String kodeMK = scanner.nextLine();
            
            System.out.print("Masukkan nama mata kuliah: ");
            String namaMK = scanner.nextLine();

            System.out.print("Masukkan nilai angka: ");
            int nilaiAngka = Integer.parseInt(scanner.nextLine());

            MataKuliah mataKuliah = new MataKuliah(kodeMK, namaMK);
            mahasiswa.tambahMataKuliah(mataKuliah, nilaiAngka);

            System.out.print("Tambah mata kuliah lagi? (ya/tidak): ");
            String jawaban = scanner.nextLine();
            tambahMataKuliah = jawaban.equalsIgnoreCase("ya");
        }

        // Mencetak KHS
        System.out.println("\nKartu Hasil Studi (KHS) - " + mahasiswa.getNama() + " (" + mahasiswa.getNim() + ")");
        System.out.println("===============================================");
        System.out.println("Mata Kuliah\t\tNilai Huruf");
        System.out.println("-----------------------------------------------");
        for (MataKuliah mataKuliah : mahasiswa.getMataKuliahList()) {
            System.out.println(mataKuliah.getNamaMK() + "\t\t\t" + mataKuliah.getNilaiHuruf());
        }
        System.out.println("===============================================");

        scanner.close();
    }
}
