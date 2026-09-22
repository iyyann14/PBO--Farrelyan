import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Instansiasi Objek Buku
        Buku buku1 = new Buku("978-001", "Pemrograman Berorientasi Objek", "M. Zasky");
        Buku buku2 = new Buku("978-002", "Struktur Data & Algoritma", "Ardian Maulana");

        // 2. Instansiasi Objek Anggota
        Anggota anggota1 = new Anggota("A-001", "Farrelyan Hilmy Araya");

        // 3. Eksekusi Relasi: Menambahkan Peminjaman ke dalam ArrayList milik Anggota
        anggota1.tambahPeminjaman(LocalDate.of(2026, 9, 21), LocalDate.of(2026, 9, 28), buku1);
        anggota1.tambahPeminjaman(LocalDate.of(2026, 9, 22), LocalDate.of(2026, 9, 29), buku2);

        // 4. Tampilkan Hasil
        anggota1.cetakRiwayat();
    }
}