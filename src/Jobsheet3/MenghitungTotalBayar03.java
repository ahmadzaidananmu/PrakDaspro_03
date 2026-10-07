package Jobsheet3;
import java.util.Scanner;
public class MenghitungTotalBayar03 {
    public static void main(String[] args) {
        
        Scanner zae = new Scanner (System.in);
        
        double harga;
        double potongan, jml_bayar;
        double diskon = 0.15;
        
        System.out.print("Masukkan harga\t\t\t\t: ");
        harga = zae.nextInt();// double ke int otomatis, int ke double manual
        //int harga;
        //harga = (int) zae.nextDouble();// 
        
        potongan = diskon*harga;
        jml_bayar = harga-potongan;

        System.out.println("=====================================================");
        System.out.println("Jumlah yang harus anda bayar adalah\tRp. "+jml_bayar); //harga dengan diskon 15%

        zae.close(); 
    }
}
