public class InterfaceMain {
    public static void main(String[] args) {
        // Instansiasi 1 objek Kulkas
        Kulkas kulkasSaya = new Kulkas();
        kulkasSaya.merk = "Sharp";
        kulkasSaya.harga = 3000000;
        kulkasSaya.warna = "Hitam";
        kulkasSaya.jumlahPintu = 2;

        System.out.println("=== INFO KULKAS ===");
        kulkasSaya.getInfo();

        System.out.println("-------------------");

        // Instansiasi 1 objek TV
        TV tvSaya = new TV();
        tvSaya.merk = "Samsung";
        tvSaya.harga = 5000000;
        tvSaya.warna = "Silver";
        tvSaya.jenisLayar = "OLED";
        tvSaya.volume = 15;

        System.out.println("=== INFO TV ===");
        tvSaya.getInfo();
    }
}