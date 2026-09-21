import java.time.LocalDate;

public class RumahSakit09 {
    public static void main(String[] args) {
        Pegawai09 ani = new Pegawai09("1234", "Dr. Ani");
        Pegawai09 bagus = new Pegawai09("4567", "Dr. Bagus");

        Pegawai09 desi = new Pegawai09("1234", "Ns. Desi");
        Pegawai09 eka = new Pegawai09("4567", "Ns. Eka");

        Pasien09 pasien1 = new Pasien09("343298", "M. Zasky");
        pasien1.tambahKonsultasi09(LocalDate.of(2026 , 9 , 20), desi, eka);
        pasien1.tambahKonsultasi09(LocalDate.of(2026 , 9 , 21), desi, eka);

        System.out.println(pasien1.getInfo());

        Pasien09 pasien2 = new Pasien09("343299", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
