package Jobsheet5;
import java.util.Scanner;
public class Tugas2SeleksiAsisten03 {
    public static void main(String[] args) {
        Scanner zae= new Scanner(System.in);
        boolean status,sanksi,sertifikat;
        int nilai=0,wawancara=0;
        String hasil=" ";

        System.out.print("Apakah status mahasiswa aktif (false/true) : ");
        status=zae.nextBoolean();
        System.out.print("Apakah mahasiswa sedang di sanksi (false/true) : ");
        sanksi=zae.nextBoolean();
        
        if (status && !sanksi) {
            System.out.print("Masukkan nilai dasar pemrogaman mahasiswa : ");
            nilai=zae.nextInt();
            System.out.print("Apakah mahasiswa memiliki sertifikat kompetensi pemrogaman (false/true) : ");
            sertifikat=zae.nextBoolean();
            if (nilai>=78 || sertifikat) {
                System.out.print("Masukkan nilai wawancara mahasiswa : ");
                wawancara=zae.nextInt();
                if (wawancara>=73) {
                    hasil="Selamat, Mahasiswa diterima sebagai asisten";
            }else{
                hasil="Maaf, Wawancara mahasiswa kurang memuaskan";
            }
        }else{
            hasil="Maaf, Nilai mahasiswa tidak mencapai passing grade dan mahasiswa tidak memiliki sertifikat ";
        }
    }else{
        hasil="Maaf, Status mahasiswa tidak aktif atau mahasiswa sedang di sanksi ";
    }
    
    System.out.println(hasil);
        zae.close();
    }
}
