public class Dragon09 {
    int x;
    int y;
    int direction;
    
    // Constructor Default Untuk Inisialisasi Posisi dan Arah Awal Dragon
    public Dragon09() {
        x = 0;
        y = 0;
        direction = 1;
    }

    // Constructor Berparameter Untuk Inisialisasi Posisi dan Arah Dragon
    public Dragon09(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        changeDirection(direction);
    }

    // Method Untuk Mengubah Arah Dragon dengan Validasi Nilai 1 - 4
    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah Tidak Valid! Gunakan 1 (Atas), 2 (Kanan), 3 (Bawah), atau 4 (Kiri).");
        }
    }

    // Method Untuk Berpindah Posisi Berdasarkan Direction
    public void move(int steps) {
        switch (direction) {
            // Atas
            case 1 :
                y -= steps;
                break;
            //Kanan
            case 2 : 
                x += steps;
                break;
            //Bawah
            case 3 :
                y += steps;
                break;
            //Kiri
            case 4 :
                x -= steps;
                break;
            default :
                System.out.println("Direction Tidak Valid! Dragon Tidak Bergerak.");
        }
    }

    // Method Untuk Mencetak Status Posisi dan Arah Dragon
    public void printStatus() {
        System.out.println("Posisi  :   (" + x + ", " + y + ")");
        System.out.println("Arah    :   " + direction);
        System.out.println("=============================");
    }
}