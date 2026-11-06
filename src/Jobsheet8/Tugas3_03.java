package Jobsheet8;
import java.util.Scanner;
public class Tugas3_03 {
    public static void main(String[] args) {
        Scanner zaeInt = new Scanner (System.in);

        int jumlahToko;
        do{
        System.out.print("Masukkan jumlah toko di pusat perbelanjaan Polinema : ");
        jumlahToko = zaeInt.nextInt();
            if (jumlahToko<1) {
                System.out.println("Jumlah toko minimal 1, Ulangi input!");
            }
        }while(jumlahToko<1);

        int i =1;
        int totalPelanggan=0;
        int barangTerbanyak=-1;
        int tokoBarangTerbanyak=0;
        int totalBarang=0;
        while (i<=jumlahToko) {
            int jumlahPelanggan;
            do{
            System.out.print("Masukkan jumlah pelanggan toko "+i+" : ");
            jumlahPelanggan= zaeInt.nextInt();
                if (jumlahPelanggan<0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif, Ulangi input!");
                }
            }while(jumlahPelanggan<0);
            int j =1;
            int barangPerToko=0;

            while (j<=jumlahPelanggan) {
                int jumlahBarang;
                do{
                System.out.print("Masukkan jumlah barang yang dibeli pelanggan "+j+" toko "+i+" : ");
                jumlahBarang = zaeInt.nextInt();
                    if (jumlahBarang<0) {
                        System.out.println("Jumlah barang tidak boleh negatif, Ulangi input!");
                    }
                }while(jumlahBarang<0);
            
                barangPerToko+=jumlahBarang;
                
                totalBarang+=jumlahBarang;
                j++;
            }
            System.out.println("Jumlah penjualan barang toko "+i+" : "+barangPerToko);
            System.out.println("===========================================================");
            if (barangPerToko>barangTerbanyak) {
                barangTerbanyak=barangPerToko;
                tokoBarangTerbanyak=i;
            }

            totalPelanggan+=jumlahPelanggan;
            
            i++;
        }
        System.out.println("Jumlah total barang dari seluruh toko : "+totalBarang);
        System.out.println("Total pelanggan :"+totalPelanggan);
        System.out.println("Jumlah penjualan terbanyak dalam 1 toko : "+barangTerbanyak);
        System.out.println("Toko dengan penjualan barang terBanyak : "+tokoBarangTerbanyak);
        zaeInt.close();
    }
}
