public class MainTugas {
    public static void main(String[] args) {

        // Objek 1: Menggunakan Constructor Berparameter Subclass Gacoan
        Gacoan pesanan1 = new Gacoan("Mie Gacoan", "Bintang 5", 10000, "Tersedia", 3);

        // Objek 2: Menggunakan Constructor Berparameter Subclass Dikichi
        Dikichi pesanan2 = new Dikichi("Dikichi Crispy", "Bintang 4.5", 15000, "Tersedia", "Spicy");

        // Print info objek 1
        System.out.println("=== INFO PESANAN 1 ===");
        System.out.println("Nama Menu  : " + pesanan1.nama);
        System.out.println("Stok       : " + pesanan1.stok);
        System.out.println("Harga Awal : Rp " + pesanan1.harga);
        System.out.println("Level Pedas: " + pesanan1.levelKepedesan);
        System.out.println("Total Harga: Rp " + pesanan1.cetakHarga()); // Memanggil Method Overriding Gacoan
        pesanan1.buatMie(pesanan1.levelKepedesan);

        // Print info objek 2
        System.out.println("\n=== INFO PESANAN 2 ===");
        System.out.println("Nama Menu  : " + pesanan2.nama);
        System.out.println("Stok       : " + pesanan2.stok);
        System.out.println("Varian Ayam: " + pesanan2.varianAyam);
        System.out.println("Total Harga: Rp " + pesanan2.cetakHarga()); // Memanggil Method Overriding Dikichi
        pesanan2.gorengAyam(pesanan2.varianAyam);
    }
}