import java.util.ArrayList;
import java.time.LocalDate;

public class Pasien09 {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi09> riwayatKonsultasi;

    public Pasien09(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi09>();
    }

    public void tambahKonsultasi09(LocalDate tanggal, Pegawai09 dokter, Pegawai09 perawat) {
        Konsultasi09 konsultasi = new Konsultasi09(tanggal, dokter, perawat);
        riwayatKonsultasi.add(konsultasi);
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo() {
        String info = "";
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
        info += "Nama               : " + this.nama + "\n";

        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";

            for (Konsultasi09 konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();
            }
        }
        else {
            info += "Riwayat Konsultasi : Tidak Ada Riwayat Konsultasi.";
        }

        info += "\n";

        return info;
    }
}
