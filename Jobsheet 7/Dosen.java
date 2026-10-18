public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        System.out.println("Ini adalah constructor dari class Dosen");
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "NIDN   : " + nidn + "\n";
        return info;
    }
}
