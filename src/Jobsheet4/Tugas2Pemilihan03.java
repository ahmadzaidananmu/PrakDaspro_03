package Jobsheet4;
import java.util.Scanner;
public class Tugas2Pemilihan03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);

        int jumlahSks;
        System.out.print("Masukkan jumlah SKS yang ingin diambil  : ");
        jumlahSks = zae.nextInt();

        if (jumlahSks>24) {
            System.out.println("KRS melebihi batas");
        }else {
            System.out.println("KRS valid");
        }
        zae.close();
    }
}
