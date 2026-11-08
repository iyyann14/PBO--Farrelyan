public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Jenis Kipas: " + jenis);
    }
}