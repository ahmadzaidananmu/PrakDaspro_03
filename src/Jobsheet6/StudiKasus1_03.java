package Jobsheet6;
import java.util.Scanner;
public class StudiKasus1_03 {
    public static void main(String[] args) {
    Scanner zae = new Scanner (System.in);
    int hargaCup=18_000,hargaTotal,jumlahCup,uangBayar,totalBayar,diskon,kembalian,kurang;

    System.out.print("Masukkan jumlah cup\t: ");
    jumlahCup=zae.nextInt();
    System.out.print("Masukkan uang bayar\t: ");
    uangBayar=zae.nextInt();

    hargaTotal=jumlahCup*hargaCup;
    diskon=0;
    if (hargaTotal>=100_000) {
        diskon=hargaTotal*10/100;
    }
    totalBayar=hargaTotal-diskon;

    System.out.println("Total harga\t\t: "+hargaTotal);
    System.out.println("Anda mendapat diskon\t: "+diskon);
    System.out.println("Anda perlu membayar\t: "+totalBayar);

    if (uangBayar>=totalBayar) {
        kembalian=uangBayar-totalBayar;
        System.out.println("Kembalian\t: "+kembalian);
    }else{
        kurang=totalBayar-uangBayar;
        System.out.println("Kurang\t\t: "+kurang);
    }
    zae.close();
    }
}
