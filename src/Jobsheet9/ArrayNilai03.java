package Jobsheet9;
import java.util.Scanner;
public class ArrayNilai03 {
    public static void main(String[] args) {
        int nilaiAkhir[]=new int[10];
        Scanner zae = new Scanner (System.in);

        int i=0;
        for (int nilai : nilaiAkhir) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiAkhir[i]=zae.nextInt();
            i++;
            }
        
        int nomor =1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "Lulus" : "Tidak Lulus";
            if (status.equalsIgnoreCase("lulus")) {
                System.out.println("Mahasiswa ke-" + nomor + ": " + nilai + " (" + status + ") ");
            }
        nomor++;
        }
        zae.close();
    }
}
