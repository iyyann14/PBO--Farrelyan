public class Dikichi extends Menu {
    public String varianAyam;

    public Dikichi() {
        super();
    }

    public Dikichi(String nama, String rating, double harga, String stok, String varianAyam) {
        super(nama, rating, harga, stok);
        this.varianAyam = varianAyam;
    }

    public void gorengAyam(String varianAyam) {
        System.out.println("Pesanan diproses: Menggoreng Ayam Varian " + varianAyam);
    }

    public double cetakHarga() {
        return super.harga;
    }
}