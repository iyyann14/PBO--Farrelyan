public class Anggota09 {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota09 (String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; //Default
    }

    public String getNama() {
        return this.nama;
    }

    public int getLimitPinjaman() {
        return this.limitPinjaman;
    }

    public int getJumlahPinjaman() {
        return this.jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if ((this.jumlahPinjaman + nominal) > this.limitPinjaman) {
            System.out.println("Maaf, Jumlah Pinjaman Melebihi Limit");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    public void angsur(int nominal) {
        if (nominal < (this.jumlahPinjaman * 0.1)) {
            System.out.println("Maaf, Angsuran Harus 10% Dari Jumlah Pinjaman");
        } else {
            this.jumlahPinjaman -= nominal;
        }
    }
}
