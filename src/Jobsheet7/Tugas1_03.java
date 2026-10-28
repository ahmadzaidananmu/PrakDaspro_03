package Jobsheet7;
import java.util.Scanner;
public class Tugas1_03 {
    public static void main(String[] args) {
    Scanner zaeInt = new Scanner (System.in);
    Scanner zaeStr = new Scanner (System.in);

    int tiket,totalTiket=0;
    double hargaTiket=46_000,totalHarga=0,diskon,hargaAkhir;//(40000 + (3 mod 6) × 2000 = 46_000)
    String nama;

    
    while (true) {
        System.out.print("Masukkan nama pelanggan (ketik 'selesai' untuk menyelesaikan transaksi) : ");
        nama=zaeStr.nextLine();
        if (nama.equalsIgnoreCase("selesai")) {
            break;
        }
        System.out.print("Masukkan jumlah tiket yang ingin dibeli : ");
        tiket=zaeInt.nextInt();

        if (tiket<0) {
            System.out.println("Input tidak valid");
            continue;
        }
        
        if (tiket>3&&tiket<=11) {//((3 + (3 mod 3) = 3)
            diskon=(hargaTiket*tiket)*0.11;// ((8 + (3 mod 5))% =11%)
        }else if (tiket>11) {//(8 + (3 mod 4) = 11)
            diskon=(hargaTiket*tiket)*0.18;// ((15 + (P mod 4))% = 18%)
        }else{
            diskon=0;
        }
        hargaAkhir=(hargaTiket*tiket)-diskon;
        System.out.println("Harga tiket saat ini : Rp."+hargaAkhir);
        totalTiket+=tiket;
        totalHarga+=hargaAkhir;
    }
        
    
    System.out.println("Total penjualan tiket : "+totalTiket);
    System.out.println("Total penghasilan uang : Rp."+totalHarga);
    System.out.println("Transaksi selesai");
    
    zaeStr.close();
    zaeInt.close();
    }
}
