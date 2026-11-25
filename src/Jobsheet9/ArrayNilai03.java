package Jobsheet9;
import java.util.Scanner;
public class ArrayNilai03 {
    public static void main(String[] args) {
        int nilaiAkhir[]=new int[10];
        Scanner zae = new Scanner (System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
                System.out.print("masukkan nilai mahasiswa ke-"+(i+1)+": ");
                nilaiAkhir[i]=zae.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i]>70)?"Lulus":"Tidak Lulus";
            if (status.equalsIgnoreCase("Lulus")) {
                System.out.println("Mahasiswa ke-"+(i+1)+": "+nilaiAkhir[i]+" ("+status+") ");
            }
        }
        zae.close();
    }
}
