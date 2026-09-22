import java.util.ArrayList;
import java.time.LocalDate;

public class Anggota {
    private String idAnggota;
    private String nama;

    // Relasi Agregasi/Asosiasi
    private ArrayList<Peminjaman> riwayatPeminjaman;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        // Inisialisasi ArrayList
        this.riwayatPeminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    // Method Untuk Menambahkan Objek Peminjaman ke Dalam ArrayList
    public void tambahPeminjaman(LocalDate tanggalPinjam, LocalDate tanggalKembali, Buku buku) {
        Peminjaman pinjamBaru = new Peminjaman(tanggalPinjam, tanggalKembali, buku);
        this.riwayatPeminjaman.add(pinjamBaru);
    }

    // Method Untuk Menampilkan Semua Data beserta Isi ArrayList
    public void cetakRiwayat() {
        System.out.println("=======================================");
        System.out.println("Data Anggota : " + nama + " (ID: " + idAnggota + ")");
        System.out.println("Riwayat Peminjaman:");

        if (riwayatPeminjaman.isEmpty()) {
            System.out.println("- Belum ada buku yang dipinjam.");
        } else {
            // Looping Untuk Mencetak Setiap Objek di Dalam ArrayList
            for (Peminjaman p : riwayatPeminjaman) {
                System.out.println(p.getInfo());
            }
        }
        System.out.println("=======================================\n");
    }
}