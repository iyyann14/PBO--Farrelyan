public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public Pegawai() {
        System.out.println("Ini adalah constructor dari class Pegawai");
    }

    public final String getInfo() {
        String info = "";
        info += "NIP    : " + this.nip + "\n";
        info += "Nama   : " + this.nama + "\n";
        info += "Gaji   : " + this.gaji + "\n";
        return info;
    }
}
