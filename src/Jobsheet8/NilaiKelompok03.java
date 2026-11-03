package Jobsheet8;
import java.util.Scanner;
public class NilaiKelompok03 {
    public static void main(String[] args) {    
        Scanner zaeInt = new Scanner (System.in);

        System.out.print("Masukkan jumlah kelompok : ");
        int jumlahKelompok = zaeInt.nextInt();
        System.out.print("Masukkan jumlah penilai : ");
        int jumlahPenilai = zaeInt.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("Jumlah kelompok dan penilai tidak boleh kurang dari 0");
        }else{
            int nomorKelompok = 1;
            double rataTertinggi = -1;
            int kelompokTerbaik = 0;

            while (nomorKelompok<=jumlahKelompok) {
                System.out.println("Kelompok "+nomorKelompok);
                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do{
                        System.out.print("  Nilai dari penilai "+j+" : ");
                        nilai= zaeInt.nextInt();
                        if (nilai<0||nilai>100) {
                            System.out.println("Nilai harus di rentang 0-100. ulaingi input!");
                        }
                    }while(nilai<0||nilai>100);
                    totalNilai+=nilai;                        
                }
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("kelompok"+nomorKelompok+": Nilai rata-rata = "+rataNilai);
                System.out.println("///////////////////////");
                if (rataNilai>rataTertinggi) {
                    rataTertinggi=rataNilai;
                    kelompokTerbaik=nomorKelompok;
                }
                nomorKelompok++;
            }
            System.out.println("======================");
            System.out.println("kelompok Terbaik : "+kelompokTerbaik);
            System.out.println("Rata-rata Tertinggi :"+rataTertinggi);
        }
        zaeInt.close();
    }
}
