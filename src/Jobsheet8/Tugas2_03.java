package Jobsheet8;
import java.util.Scanner;
public class Tugas2_03 {
    public static void main(String[] args) {
        Scanner zaeInt = new Scanner (System.in);

        System.out.print("Masukkan nilai N : ");
        int n =zaeInt.nextInt();

        int i = 1;
        int jumlahAngka =0;
        while (i<=n) {
            int j = 1;
            while (j<=n) {
                System.out.print("\t"+i*j);
                jumlahAngka+=i*j;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Jumlah seluruh angka : "+jumlahAngka);
        zaeInt.close();
    }
}
