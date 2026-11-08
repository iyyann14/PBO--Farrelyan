package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Gacoan mie1 = new Gacoan();
        mie1.nama = "Mie Gacoan";
        mie1.harga = 10000; 
        mie1.rating = "4.8/5";
        mie1.stok = "Tersedia 50 porsi";
        mie1.levelKepedasan = 3; 

        System.out.println("=== INFO PESANAN GACOAN ===");
        mie1.cetakHarga();
        mie1.cetakRating(); 
        mie1.cetakStok();   
        System.out.println("---------------------------");
        mie1.masak();
        System.out.println("---------------------------");
        mie1.sajikan();

        System.out.println("\n");

        Dikichi ayam1 = new Dikichi();
        ayam1.nama = "Paket Ayam";
        ayam1.harga = 12000; 
        ayam1.rating = "4.5/5";
        ayam1.stok = "Tersedia 20 porsi";
        ayam1.varianAyam = "Nashville"; 

        System.out.println("=== INFO PESANAN DIKICHI ===");
        ayam1.cetakHarga();
        ayam1.cetakRating(); 
        ayam1.cetakStok();   
        System.out.println("---------------------------");
        ayam1.masak();
        System.out.println("---------------------------");
        ayam1.sajikan();
    }
}