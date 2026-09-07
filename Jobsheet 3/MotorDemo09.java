public class MotorDemo09 {
    public static void main(String[] args) {
        Motor09 motor1 = new Motor09();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayInfo();
        System.out.println("================================");

        Motor09 motor2 = new Motor09();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true);
        motor2.setKecepatan(80);
        motor2.displayInfo();
        System.out.println("================================");

        Motor09 motor3 = new Motor09();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayInfo();
        System.out.println("================================");
    }
}
