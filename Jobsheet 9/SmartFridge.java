public class SmartFridge extends Kulkas implements Audible {
    public String ukuranLayar;
    public int volume;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }

    @Override
    public void turunkanVolume() {
        volume -= 1;
    }
}