package Jobsheet3;
import java.util.Scanner;
public class TotalCetak03 {
    public static void main(String[] args) {
    
        Scanner zae = new Scanner (System.in);

        int jumlah, totCetak, totBiaya;
        int cetak = 500;
        int jilid = 5000;

        System.out.print("Masukkkan jumalah lembar yang dicetak\t: ");
        jumlah = zae.nextInt();
        
        totCetak = jumlah*cetak;
        totBiaya = totCetak+jilid;

        System.out.println("Total biaya yang perlu dibayar\t: Rp."+totBiaya);
        
        zae.close();
    }
    
}
