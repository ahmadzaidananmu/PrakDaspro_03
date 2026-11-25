package Jobsheet9;
import java.util.Scanner;

public class ArrayRataNilai03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        int jumlah;
        System.out.print("Masukkan jumlah mahsiswa : ");
        jumlah=zae.nextInt();

        int total=0,nilaiMhs[]=new int[jumlah];
        double rata2;
        int lulus=0,tidakLulus=0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i]=zae.nextInt();
            if (nilaiMhs[i]>70) lulus++;
            else tidakLulus++;
            total+=nilaiMhs[i];            
        }

        int tertinggi=nilaiMhs[0],terendah=nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (tertinggi<nilaiMhs[i])tertinggi=nilaiMhs[i];
            if (terendah>nilaiMhs[i])terendah=nilaiMhs[i];
        }

        String predikat;
        int untukPredikat = total/nilaiMhs.length;
        if (untukPredikat>=85) predikat="Sangat Baik";
            else if (untukPredikat>=70) predikat="Baik";
            else predikat="Perlu Bimbingan";

        rata2=(double)total/nilaiMhs.length;
        System.out.println("Total nilai : "+total);
        System.out.println("Rata-rata : "+rata2);
        System.out.println("Jumlah mahasiswa lulus : "+lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : "+tidakLulus);
        System.out.println("Nilai tertinggi : "+tertinggi);
        System.out.println("Nilai terendah : "+terendah);
        System.out.println("Predikat kelas : "+predikat);
        
        zae.close();
    }
}
