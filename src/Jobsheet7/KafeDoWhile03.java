package Jobsheet7;
import java.util.Scanner;
public class KafeDoWhile03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);

        int kopi,teh,roti,hargaK=13_000,hargaT=8_000,hargaR=18_000,totalHarga;
        String nama;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            nama=zae.nextLine();
            if (nama.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Masukkan jumlah kopi : ");
            kopi=zae.nextInt();
            System.out.print("Masukkan jumlah teh : ");
            teh=zae.nextInt();
            System.out.print("Masukkan jumlah roti   : ");
            roti=zae.nextInt();
            totalHarga=(kopi*hargaK)+(teh*hargaT)+(roti*hargaR);
            System.out.println("Total : Rp."+totalHarga);
            zae.nextLine();
        } while (true);
        zae.close();
    }
}
