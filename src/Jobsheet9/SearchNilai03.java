package Jobsheet9;
import java.util.Scanner;
public class SearchNilai03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        int jumlah;
        System.out.print("Masukkan jumlah nilai : ");
        jumlah=zae.nextInt();
        int nilai[]=new int [jumlah];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilai[i]=zae.nextInt();
        }
        
        int key;
        System.out.print("Masukkan key yang ingin dicari: ");
        key=zae.nextInt();
        
        boolean ditemukan=false;

        for (int i = 0; i < nilai.length; i++) {
            if (key==nilai[i]) {
                System.out.println("Nilai "+key+" ditemukan pada indeks ke-"+i);
                ditemukan= true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai "+key+" tidak ditemukan dalam array (diperiksa "+nilai.length+" elemen, indeks 0-"+(nilai.length-1)+")");
        }
    zae.close();
    }
}
