package Jobsheet5;
import java.util.Scanner;
public class NestedAksesLAb03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        boolean mahasiswa_aktif,sedang_diSanksi,izinDosen,asistenLab;
        String akses;

        System.out.print("Apakah status mahasiswa aktif (true/false)\t\t\t: ");
        mahasiswa_aktif = zae.nextBoolean();
        System.out.print("Apakah mahasiswa sedang mendapatkan sanksi (true/false)\t\t: ");
        sedang_diSanksi = zae.nextBoolean();
        System.out.print("Apakah mahasiswa memiliki izin dosen (true/false)\t\t: ");
        izinDosen = zae.nextBoolean();
        System.out.print("Apakah mahasiswa adalah asisten laboratorium (true/false)\t: ");
        asistenLab = zae.nextBoolean();

        if (mahasiswa_aktif && !sedang_diSanksi) {
            if (izinDosen || asistenLab) {
                akses="Akses laboratorium diberikan";
            }else{
                akses="Akses ditolak : Membutuhkan izin dosen atau status asisten lab";
                //cek
            }
        }else{
            akses="Akses ditolak : Status mahasiswa tidak memenuhi syarat";
        }
        System.out.println(akses);
        zae.close();
    }
}
