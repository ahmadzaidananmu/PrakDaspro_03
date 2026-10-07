package Jobsheet1;

public class RobotArm03 {
    public static void main(String[] args) {
      System.out.println("Kondisi awal : Nampan A = bintang, Nampan B = bulan, Nampan C = 0");
      // langkah 1) Ambil bola di nampan A, taruh di nampan C. 
      System.out.println("Setelah langkah 1 : Nampan A = 0, Nampan B = bulan, Nampan C = bintang");
      // langkah 2) Ambil bola di nampan B, taruh di nampan A.
      System.out.println("Setelah langkah 2 : Nampan A = bulan, Nampan B = 0, Nampan C = bintang");
      // langkah 3) Ambil bola di nampan C, taruh di nampan B.
      System.out.println("Setelah langkah 3 : Nampan A = bulan, Nampan B = bintang, Nampan C = 0");
      // Pernyataan : 
      //(a) Kedua bola sudah bertukar tempat; 
      //(b) ada dua bola di nampan A; 
      //(c) ada dua bola di nampan B; 
      //(d) nampan A kosong; 
      //(e) nampan C kosong; 
      //(f) tidak ada yang berubah, tiap bola kembali ke tempat asalnya. 
      System.out.println("Kesimpulan : Pernyataan yang benar adalah (a) Kedua bola telah bertukar tempat & (e) Nampan C kosong");
    }
}    