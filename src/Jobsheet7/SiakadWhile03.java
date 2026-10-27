package Jobsheet7;
import java.util.Scanner;
public class SiakadWhile03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        
        int nilai,jml,i=1;
        String grade;
        System.out.print("Masukkan jumlah mahsiswa: ");
        jml=zae.nextInt();

        while (i<=jml) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+" : ");
            nilai=zae.nextInt();

            if (nilai<0||nilai>100) {
                System.out.println("Input tidak valid, masukkan nilai yang valid!");
                continue;
            }

            if (nilai<=100&&nilai>80) {
                grade="A";
            }else if (nilai<=80&&nilai>73) {
                grade="B+";
            }else if (nilai<=73&&nilai>65) {
                grade="B";
            }else if (nilai<=65&&nilai>60) {
                grade="C+";
            }else if (nilai<=60&&nilai>50) {
                grade="C";
            }else if (nilai<=50&&nilai>39) {
                grade="D";
            }else{
                grade="E";
            }
            System.out.println("Grade mahasiswa ke"+i+" : "+grade);
            if (grade=="A") {
                System.out.println("Bagus, pertahankan nilainya");
            }

            i++;
        }
        zae.close();
    }
}
