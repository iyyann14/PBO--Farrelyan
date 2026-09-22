public class Buku {
    // Enkapsulasi: Atribut Private
    private String isbn;
    private String judul;
    private String penulis;

    // Constructor
    public Buku(String isbn, String judul, String penulis) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
    }

    // Getter Untuk Membaca Data
    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    // Setter Untuk Mengubah Data
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getInfo() {
        return judul + " (Karya: " + penulis + ")";
    }
}