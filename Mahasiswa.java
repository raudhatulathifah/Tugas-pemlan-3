import java.util.*;

public class Mahasiswa {
    private String nim;
    private String nama;
    private List<MataKuliah> mataKuliahList;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.mataKuliahList = new ArrayList<>();
    }

    public void tambahMataKuliah(MataKuliah mataKuliah, int nilaiAngka) {
        mataKuliah.setNilaiHuruf(nilaiAngka);
        mataKuliahList.add(mataKuliah);
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public List<MataKuliah> getMataKuliahList() {
        return mataKuliahList;
    }
}


