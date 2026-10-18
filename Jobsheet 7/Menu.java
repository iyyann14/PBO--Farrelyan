public class Menu {
    public String nama;
    public String rating;
    public double harga;
    public String stok;

    // Langkah 2: Method Overloading Constructor (Tanpa Parameter)
    public Menu() {
    }

    // Langkah 2: Method Overloading Constructor (Berparameter)
    public Menu(String nama, String rating, double harga, String stok) {
        this.nama = nama;
        this.rating = rating;
        this.harga = harga;
        this.stok = stok;
    }

    // Langkah 4: Method yang Akan diOverride
    public double cetakHarga() {
        return this.harga;
    }
}