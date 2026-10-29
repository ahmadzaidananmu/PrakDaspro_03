package Jobsheet8;
import java.util.Scanner;
public class RekapPenjualan03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);

        int jumlahTerjual,jumlahProduk=3,totalPerHari=0,jumlahHari=4,totalPenjualan=0;

        int i=0;
        while (i<jumlahHari) {
            int j=0;
            while (j<jumlahProduk) {
                System.out.print("Input jumlah terjual produk "+(j+1)+" hari ke "+(i+1)+" : ");
                jumlahTerjual=zae.nextInt();
                
                totalPerHari+=jumlahTerjual;
                j++;
            }
            System.out.println("Total per hari : "+ totalPerHari);
            totalPenjualan+=totalPerHari;
            totalPerHari=0;
            i++;
        }
        System.out.println("Total penjualan : "+totalPenjualan);
        zae.close();
    }
}
