package Jobsheet4;
import java.util.Scanner;
public class Tugas1Pemilihan03 {
    public static void main(String[] args) {
    Scanner zae = new Scanner (System.in);

    boolean uktLunas;
    String pesan;

    System.out.println("--- CETAK KRS SIAKAD ---");
    System.out.print("Apakah UKT sudah lunas (True/False): ");
    uktLunas = zae.nextBoolean();

   pesan = (uktLunas) ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak, silahkan lunasi UKT terlebih dahulu";
   System.out.println(pesan);
    zae.close();
    }
}