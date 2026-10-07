package Jobsheet4;
import java.util.Scanner;
public class TugasAntrean03 {
   public static void main(String[] args) {
    Scanner zae = new Scanner (System.in);
    int kode;
    String layanan="", loket="";
    System.out.println("1.  Legalisir ijasah");
    System.out.println("2.  Surat keterangan aktif kuliah");
    System.out.println("3.  Pembayaran UKT");
    System.out.println("4.  Pengajuan cuti akademik");
    System.out.println("===================================");
    System.out.print("Masukkan kode layanan      : ");
    kode = zae.nextInt();

    switch (kode) {
        case 1:
            layanan="Legalisir ijasah";
            loket="A";
         break;
        case 2:
            layanan="Surat keterangan aktif kuliah";
            loket="B";
           break;
        case 3:
            layanan="Pembayaran UKT";
            loket="C";
            break;      
        case 4:                  
            layanan="Pengajuan cuti akademik";
            loket="D";
            break;
        default:
            layanan="Kode layanan tidak tersedia";
            loket="?";
            break;
    }
    System.out.println("Layanan yang anda pilih         : "+layanan);
    System.out.println("Loket layanan anda adalah       : loket "+loket);
    zae.close();
   } 
}
