public class Demo {
    public static void main(String[] args) {
        Pegawai pegawaiAsli = new Pegawai("12345", "Budi");

        Dosen dosenPalsu = (Dosen) pegawaiAsli;
    }
}