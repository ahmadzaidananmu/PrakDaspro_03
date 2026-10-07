package Jobsheet5;
import java.util.Scanner;
public class OperatorLogikaWifi03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        boolean mahasiswa,dosen,akun_diBlokir;  

        System.out.print("Apakah pengguna dosen (true/false)\t\t: ");
        dosen=zae.nextBoolean();
        System.out.print("Apakah pengguna mahasiwa (true/false)\t\t: ");
        mahasiswa=zae.nextBoolean();
        System.out.print("Apakah akun pengguna diblokir (true/false)\t: ");
        akun_diBlokir=zae.nextBoolean();

        if ((mahasiswa||dosen) && !akun_diBlokir) {
            System.out.println("Akses wifi diberikan");
        }else{
            System.out.println("Akses wifi ditolak");
        }

        zae.close();
    }
}
