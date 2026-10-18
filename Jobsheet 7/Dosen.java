public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Ini adalah constructor dari class Dosen");
    }

    public String getAllInfo() {
        String info = this.getInfo();
        info += "NIDN   : " + this.nidn + "\n";
        return info;
    }
}
