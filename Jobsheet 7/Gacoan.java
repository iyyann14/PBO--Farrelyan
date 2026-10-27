public class Gacoan extends Menu {
    public int levelKepedesan;

    public Gacoan() {
        super();
    }

    public Gacoan(String nama, String rating, double harga, String stok, int levelKepedesan) {
        super(nama, rating, harga, stok);
        this.levelKepedesan = levelKepedesan;
    }

    public void buatMie(int levelKepedesan) {
        System.out.println("Pesanan diproses: Membuat Mie Dengan Level Kepedesan " + levelKepedesan);
    }

    public double cetakHarga() {
        return super.harga + (this.levelKepedesan * 1000);
    }
}