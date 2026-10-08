package Jobsheet6;
import java.util.Scanner;
public class StudiKasus2_03 {
 public static void main(String[] args) {
    Scanner zae= new Scanner (System.in);
     String mahasiswa,kegiatan,pesan;
     int dokumen=5,juara=4;

    System.out.print("Nama Mahasiswa\t: ");
    mahasiswa=zae.nextLine();
    System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya)\t: ");
    kegiatan=zae.nextLine();
    
    if (kegiatan.equalsIgnoreCase("BAKORMA")||
        kegiatan.equalsIgnoreCase("BELMAWA")||
        kegiatan.equalsIgnoreCase("Mandiri")){
        System.out.print("Peringkat juara (1/2/3/0)\t: ");
        juara=zae.nextInt();
        if (juara>=1&&juara<=3) {
            System.out.print("Jumlah dokumen\t: ");
            dokumen=zae.nextInt();
            switch (dokumen) {
                case 1:
                    pesan="Dokumen kurang 3, dana penghargaan tidak diberikan";
                    break;
                case 2:
                    pesan="Dokumen kurang 2, dana penghargaab tidak dberikan";
                    break;
                case 3:
                    pesan="Dokumen kurang 1, dana penghargaan tidak diberikan";
                case 4:
                    pesan="Dokumen lengkap, dana penghargaan diberikan";
                    break;
                default:
                    pesan="input error";
                    break;
            }
        }else if (juara==0){
            pesan="Juara harapan atau peserta tidak mendapatkan dana penghargaan";
        }else{
            pesan="Input error";
        }
    }else{
        pesan="input error";
    }
    System.out.println("Status mahasiswa "+mahasiswa+"\t: "+pesan);
    zae.close();
    }   
}
