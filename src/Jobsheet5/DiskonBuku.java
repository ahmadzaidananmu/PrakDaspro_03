package Jobsheet5;
import java.util.Scanner;
public class DiskonBuku {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        boolean hari;
        String jenisBuku;
        int jumlahBuku;
        double diskonBuku=0.0,diskonAkhir;

        System.out.print("Apakah ini hari rabu (false/true) : ");
        hari=zae.nextBoolean();
        System.out.print("Jenis buku yang dibeli : ");
        jenisBuku=zae.next();
        System.out.print("Jumlah buku yang dibeli : ");
        jumlahBuku=zae.nextInt();

        if (hari==true){
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskonBuku=0.11;
            if (jumlahBuku>3) {
                diskonBuku+=0.02;
            }
        }else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskonBuku=0.08;
            if (jumlahBuku>4) {
                diskonBuku+=0.02;
            }else if (jumlahBuku<=4) {
                diskonBuku+=0.01;
            }
        }else{
            if (jumlahBuku>4) {
                diskonBuku=0.06;
            }
        }
        }else{
            diskonBuku=0;
        }
        diskonAkhir=diskonBuku*100;
        System.out.println("Diskon yang anda dapat adalah : "+diskonAkhir+"%");
    zae.close();
    }
}