package Tugas;

public class Dikichi extends Menu implements DapatDiSajikan {
    public String varianAyam;

    // Logika perhitungan harga berdasarkan varian ayam
    public int hitungHargaTotal() {
        int tambahan = 0;
        if (varianAyam.equalsIgnoreCase("Crispy")) {
            tambahan = 2000;
        } else if (varianAyam.equalsIgnoreCase("Nashville")) {
            tambahan = 4000;
        } else if (varianAyam.equalsIgnoreCase("Original")) {
            tambahan = 0;
        }
        return harga + tambahan;
    }

    @Override
    public void masak() {
        System.out.println("Menggoreng Ayam Untuk " + nama + " Varian " + varianAyam);
    }

    @Override
    public void cetakHarga() {
        System.out.println("Nama Menu   : " + nama);
        System.out.println("Varian      : " + varianAyam);
        super.cetakHarga(); 
        System.out.println("Total Harga : Rp " + hitungHargaTotal());
    }

    @Override
    public void sajikan() {
        System.out.println(nama + " Hangat Siap diSajikan ke Meja Pelanggan!");
    }
}