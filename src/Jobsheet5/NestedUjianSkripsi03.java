package Jobsheet5;
import java.util.Scanner;
public class NestedUjianSkripsi03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        String pesan, bebasKompen;
        int bimbinganP1,bimbinganP2;

        System.out.print("Apakah mahasiswa sudah bebas kompen\t(Ya/Tidak)\t: ");
        bebasKompen=zae.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1\t: ");
        bimbinganP1=zae.nextInt();
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2\t: ");
        bimbinganP2=zae.nextInt();

        if (bebasKompen.equalsIgnoreCase("YA")) {
            if (bimbinganP1>=9 && bimbinganP2>=3) {
                pesan="Semua syarat terpenuhi, Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1<9 && bimbinganP2<3) {
                pesan="==GAGAL!==\nLog bimbingan 1 kurang dari 9 dan Log bimbinhgan 3 kurang dari 4";
            }else if (bimbinganP1<9){
                pesan="==GAGAL!==\nLog bimbingan 1 kurang dari 9";
            }else {
                pesan="==GAGAL!==\nLog bimbingan 2 kurang dari 3";
            }
        }else{
            pesan="==GAGAL!==\nMahasiswa masih memiliki tanggungan kompen";
        }
        System.out.println(pesan);
        zae.close();
    }
}
