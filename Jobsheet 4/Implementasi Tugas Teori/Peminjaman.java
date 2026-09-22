import java.time.LocalDate;

public class Peminjaman {
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    // Relasi Asosiasi: Peminjaman Terhubung dengan 1 Objek Buku
    private Buku buku;

    public Peminjaman(LocalDate tanggalPinjam, LocalDate tanggalKembali, Buku buku) {
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
        this.buku = buku;
    }

    public LocalDate getTanggalPinjam() {
        return tanggalPinjam;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public Buku getBuku() {
        return buku;
    }

    public String getInfo() {
        return "         Meminjam buku: " + buku.getInfo() + " | Tanggal: " + tanggalPinjam + " s/d " + tanggalKembali;
    }
}