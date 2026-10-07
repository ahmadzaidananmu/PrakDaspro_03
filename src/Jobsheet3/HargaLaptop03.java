package Jobsheet3;
import java.util.Scanner;
public class HargaLaptop03 {
    public static void main(String[] args) {
        
        Scanner zae = new Scanner (System.in);

        int harga, uangMuka, lamaCicilan, sisaHarga;
        double jumlahBunga, jumlahCicilan;
        double bunga = 0.02;

        System.out.print("Masukkan harga laptop\t: ");
        harga = zae.nextInt();
        System.out.print("Masukkan uang muka\t: ");
        uangMuka = zae.nextInt();
        System.out.print("Masukkan lama cicilan\t: ");
        lamaCicilan = zae.nextInt();

        sisaHarga = harga-uangMuka;
        jumlahBunga = sisaHarga*bunga;
        jumlahCicilan = sisaHarga/lamaCicilan+jumlahBunga;

        System.out.println("===================================================================");
        System.out.println("Jumlah cicilan yang harus dibayar tiap bulan\t: Rp."+jumlahCicilan);

        zae.close(); 
    }
}
