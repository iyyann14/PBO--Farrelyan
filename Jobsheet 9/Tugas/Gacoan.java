package Tugas;

public class Gacoan extends Menu implements DapatDiSajikan {
    public int levelKepedasan; 

    // Logika perhitungan harga berdasarkan level
    public int hitungHargaTotal() {
        int tambahan = 0;
        switch (levelKepedasan) {
            case 1: 
                tambahan = 0; 
                break;
            case 2: 
                tambahan = 2000; 
                break;
            case 3: 
                tambahan = 3000; 
                break;
            case 5: 
                tambahan = 4000; 
                break;
            default:
                tambahan = 0;
                break;
        }
        return harga + tambahan;
    }

    @Override
    public void masak() {
        System.out.println("Memasak " + nama + " Dengan Level Kepedasan " + levelKepedasan);
    }

    @Override
    public void cetakHarga() {
        System.out.println("Nama Menu   : " + nama);
        System.out.println("Level       : " + levelKepedasan);
        super.cetakHarga();
        System.out.println("Total Harga : Rp " + hitungHargaTotal());
    }

    @Override
    public void sajikan() {
        System.out.println(nama + " Siap diSajikan ke Meja Pelanggan!");
    }
}