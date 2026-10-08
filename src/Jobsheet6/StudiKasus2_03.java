package Jobsheet6;
import java.util.Scanner;
public class StudiKasus2_03 {
 public static void main(String[] args) {
    Scanner zae= new Scanner (System.in);
     String mahasiswa,kegiatan,pesan=" ";
     int dokumen=5,juara=4,status=2;
     boolean isDokumen=false;

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
            if (dokumen<=4&&dokumen>=0) {
                isDokumen=true;
            }else{
                pesan="input error";
            }
        }else if (juara==0){
        pesan="Juara harapan atau peserta tidak mendapatkan dana penghargaan";
        }else{
        pesan="Input error";
        }
    }else if (kegiatan.equalsIgnoreCase("PKM")) {
        System.out.print("Status pendanaa PKM (1=lolos, 0=tidak lolos)\t: ");
        status=zae.nextInt();
        if (status==1){
            System.out.print("Jumlah dokumen\t: ");
            dokumen=zae.nextInt();
            if (dokumen<=4&&dokumen>=0) {
                isDokumen=true;
            }else{
                pesan="input error";
            }
        } else if (status==0) {
            pesan="Status pendanaan PKM tidak lolos, pendanaan tidak diberikan";
        } else{
            pesan="input error";
        }
    }else if (kegiatan.equalsIgnoreCase("Lainnya")) {
        pesan="Kegiatan diatas tidak memperoleh pendanaan";
    }else{
        pesan="input error";
    }
    if (isDokumen) {
    switch (dokumen) {
        case 1:
            pesan="Dokumen kurang 3, dana penghargaan tidak diberikan";
            break;
        case 2:
            pesan="Dokumen kurang 2, dana penghargaab tidak dberikan";
            break;
        case 3:
            pesan="Dokumen kurang 1, dana penghargaan tidak diberikan";
            break;
        case 4:
            pesan="Dokumen lengkap, dana penghargaan diberikan";
            break;
        default:
            pesan="input error";
            break;
    }
    }
    System.out.println("Status mahasiswa "+mahasiswa+"\t: "+pesan);
    zae.close();
}
}