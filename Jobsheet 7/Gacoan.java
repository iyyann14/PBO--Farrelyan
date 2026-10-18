public class Gacoan extends Menu {
    public int levelKepedesan;

    // Langkah 2: Method Overloading Constructor (Tanpa parameter memanggil super)
    public Gacoan() {
        super();
    }

    // Langkah 3: Memanggil Constructor super() Berparameter
    public Gacoan(String nama, String rating, double harga, String stok, int levelKepedesan) {
        super(nama, rating, harga, stok);
        this.levelKepedesan = levelKepedesan;
    }

    public void buatMie(int levelKepedesan) {
        System.out.println("Pesanan diproses: Membuat Mie Dengan Level Kepedesan " + levelKepedesan);
    }

    // Langkah 4: Method Overriding
    @Override
    public double cetakHarga() {
        return super.harga + (this.levelKepedesan * 1000);
    }
}