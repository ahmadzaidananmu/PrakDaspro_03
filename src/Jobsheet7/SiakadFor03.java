package Jobsheet7;
import java.util.Scanner;
public class SiakadFor03 {
    public static void main(String[] args) {
    Scanner zae = new Scanner (System.in);

    double nilai, tertinggi=0,terendah=100;
    int lulus=0,tdkLulus=0;

    for (int i = 1; i <= 11; i++) {//P=3((8+P) =11)
        System.out.print("Masukkan nilai mahasiswa ke-"+i+" : ");
        nilai=zae.nextDouble();
        if (nilai>tertinggi) {
            tertinggi=nilai;
        }
        if (nilai<terendah) {
            terendah=nilai;
        }
        if (nilai>=58) {//P=3(55 + (P mod 11) = 58)
            lulus++;
        }
        if (nilai<58) {
            tdkLulus++;
        }
    }
    System.out.println("Nilai tertinggi : "+tertinggi);
    System.out.println("Nilai terendah : "+terendah);
    System.out.println("Mahasiswa lulus : "+lulus);
    System.out.println("Mahasiswa tidak lulus : "+tdkLulus);

    zae.close();
    }
}