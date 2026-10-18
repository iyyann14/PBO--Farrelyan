public class Dikichi extends Menu {
    public String varianAyam;

    // Langkah 2: Method Overloading Constructor
    public Dikichi() {
        super();
    }

    // Langkah 3: Memanggil Constructor super() Berparameter
    public Dikichi(String nama, String rating, double harga, String stok, String varianAyam) {
        super(nama, rating, harga, stok);
        this.varianAyam = varianAyam;
    }

    public void gorengAyam(String varianAyam) {
        System.out.println("Pesanan diproses: Menggoreng Ayam Varian " + varianAyam);
    }

    // Langkah 4: Method Overriding
    @Override
    public double cetakHarga() {
        return super.harga;
    }
}