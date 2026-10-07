package Jobsheet3;
import java.util.Scanner;
public class GajiKaryawan03 {
    public static void main(String[] args) {
        
        Scanner zae = new Scanner (System.in);

        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;
        
        System.out.print("Masukkan gaji pokok anda\t: ");
        gajiPokok = zae.nextInt();
        bonus = 0.05*gajiPokok;
        totGaji = gajiPokok+tunjTransp+tunjMkn+bonus-(0.1*gajiPokok);
        
        int intTotGaji = (int) totGaji;
        
        System.out.println("============================================");
        System.out.println("Bonus bulanan anda adalah\t: Rp."+bonus);
        System.out.println("Gaji yang diterima adalah\t: Rp."+intTotGaji);

        zae.close(); 
    }
}
