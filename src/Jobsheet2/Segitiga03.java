package Jobsheet2;
import java.util.Scanner;
public class Segitiga03 {
    public static void main(String[] args) {
        
        Scanner zae = new Scanner(System.in);
        
        int Alas, Tinggi;
        float Luas;

        System.out.print("Masukkan alas : ");
        Alas = zae.nextInt();
        System.out.print("Masukkan tinggi : ");
        Tinggi = zae.nextInt();

        Luas = Alas * Tinggi / 2;

        System.out.println("Luas segitiga : "+Luas);

        zae.close();
    }
}