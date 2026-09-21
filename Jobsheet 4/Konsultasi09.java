import java.time.LocalDate;

public class Konsultasi09 {
    private LocalDate tanggal;
    private Pegawai09 dokter;
    private Pegawai09 perawat;

    public Konsultasi09(LocalDate tanggal, Pegawai09 dokter, Pegawai09 perawat) {
        this.tanggal = tanggal;
        this.dokter = dokter;
        this.perawat = perawat;
    }

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Pegawai09 getDokter() {
        return dokter;
    }

    public void setDokter(Pegawai09 dokter) {
        this.dokter = dokter;
    }

    public Pegawai09 getPerawat() {
        return perawat;
    }

    public void setPerawat(Pegawai09 perawat) {
        this.perawat = perawat;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal Konsultasi   : " + tanggal;
        info += ", Dokter : " + dokter.getInfo();
        info += ", Perawat: " + perawat.getInfo();
        info += "\n";
        
        return info;
    }
}
