public class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    // Method getInfo() Superclass
    public void getInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Warna: " + warna);
    }
}