package Jobsheet2;
import java.util.Scanner;
public class GajiBersih03 {
    public static void main(String[] args) {
        
        Scanner zae = new Scanner(System.in);

        int gaji_Pokok, jumlah_Anak, tunjangan_Anak, total_Tunjangan;
        double potongan_Pensiun = 0.1, jumlah_Potongan_Pensiun, gaji_Bersih;

        System.out.print("Masukkan gaji pokok anda\t\t: ");
        gaji_Pokok = zae.nextInt();
        System.out.print("Masukkan tunjangan anak/bulan PT XYZ\t: ");
        tunjangan_Anak = zae.nextInt();
        System.out.print("Masukkan jumlah anak anda\t\t: ");
        jumlah_Anak = zae.nextInt();
        
        total_Tunjangan = jumlah_Anak*tunjangan_Anak;
        jumlah_Potongan_Pensiun = gaji_Pokok*potongan_Pensiun;
        gaji_Bersih = gaji_Pokok+total_Tunjangan-jumlah_Potongan_Pensiun;
        
        System.out.println("====================================================");
        System.out.println("Total tunjangan anda adalah\t\t: "+total_Tunjangan);
        System.out.println("Jumlah potongan pensiun anda adalah\t: "+jumlah_Potongan_Pensiun);
        System.out.println("Gaji bersih anda adalah\t\t\t: "+gaji_Bersih);

        zae.close();
    }
}
