package Jobsheet2;
import java.util.Scanner;
public class Bank03 {
    public static void main(String[] args) {
        
        Scanner zae = new Scanner(System.in);

        int tabungan_Awal, lama_Menabung;
        double presentase_Bunga = 0.02, bunga, tabungan_Akhir;

        System.out.print("Masukkan jumlah tabungan anda : ");
        tabungan_Awal = zae.nextInt();
        System.out.print("Masukkan lama menabung anda : ");
        lama_Menabung = zae.nextInt();

        bunga = tabungan_Awal*lama_Menabung*presentase_Bunga;
        tabungan_Akhir = tabungan_Awal+bunga;
        
        System.out.println("Bunga adalah : "+bunga);
        System.out.println("Tabungan Akhir adalah : "+tabungan_Akhir);

        zae.close();
    }
}
