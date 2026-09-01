public class DragonMain09 {
    public static void main(String[] args) {
        // Instansiasi Objek Dragon Pertama
        Dragon09 dragon1 = new Dragon09();
        System.out.println("=== Status Awal Dragon 1 ===");
        dragon1.printStatus();

        System.out.println("=== Pergerakan Dragon 1 ===");
        dragon1.move(3);                // Dragon Bergerak Ke Atas 3 Langkah
        dragon1.changeDirection(2);     // Dragon Berubah Arah Ke Kanan        
        dragon1.move(5);                // Dragon Bergerak Ke Kanan 5 Langkah
        dragon1.printStatus();

        // Instansiasi Objek Dragon Kedua
        Dragon09 dragon2 = new Dragon09(10, 10, 3);
        System.out.println("=== Status Awal Dragon 2 ===");
        dragon2.printStatus();
        
        System.out.println("=== Pergerakan Dragon 2 ===");
        dragon2.move(2);                // Dragon Bergerak Ke Atas 2 Langkah
        dragon2.changeDirection(4);     // Dragon Berubah Arah Ke Kiri
        dragon2.move(4);                // Dragon Bergerak Ke Kiri 4 Langkah
        dragon2.printStatus();
    }    
}