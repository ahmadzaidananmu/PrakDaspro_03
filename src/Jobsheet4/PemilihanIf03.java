package Jobsheet4;
import java.util.Scanner;
public class PemilihanIf03 {
    public static void main(String[] args) {
    Scanner zae = new Scanner (System.in);

    boolean uktLunas;

    System.out.println("cetak KRS siakad");
    System.out.print("Apakah UKT sudah lunas (True/False): ");
    uktLunas = zae.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silahkan cetak KRS dan minta tanda tanagn DPA");
    }   else{
            System.out.println("Registrasi ditolak, silahkan lunasi UKT terlebih dahulu");
    zae.close();
    }
    }
}