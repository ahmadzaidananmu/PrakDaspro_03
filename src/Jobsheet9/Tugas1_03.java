package Jobsheet9;
import java.util.Scanner;
public class Tugas1_03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int mhs=zae.nextInt();
        int nilai[]=new int[mhs];
        int total=0,tertinggi=0,terendah=100;
        double rata2;
        String status;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilai[i]=zae.nextInt();
            total+=nilai[i];

            if (nilai[i]>tertinggi)tertinggi=nilai[i];
            if (nilai[i]<terendah)terendah=nilai[i];

            if (nilai[i]>=75) status="Lulus";
            else status="Tidak Lulus";

            System.out.println("Status : "+status);
        }

        rata2=(double)total/nilai.length;
        System.out.println("Rata-rata : "+rata2);
        System.out.println("Nilai tertinggi : "+tertinggi);
        System.out.println("Nilai terendah : "+terendah);

        zae.close();
    }
}
