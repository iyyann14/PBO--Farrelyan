package Tugas;

public abstract class Menu {
    public String nama;
    public int harga;
    public String rating;
    public String stok;

    public abstract void masak();

    public void cetakHarga() {
        System.out.println("Harga Dasar : Rp " + harga);
    }

    public void cetakRating() {
        System.out.println("Rating      : " + rating);
    }

    public void cetakStok() {
        System.out.println("Stok        : " + stok);
    }
}