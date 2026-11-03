package Jobsheet8;
import java.util.Scanner;
public class Tugas1_03 {
    public static void main(String[] args) {
        Scanner zaeInt = new Scanner (System.in);

        System.out.print("Masukkan nilai N : ");
        int n =zaeInt.nextInt();

        int i =1;
        int totalTercetak=0; 
        while (i<=n) {
            int j =1;
            while (j<=i) {
                System.out.print(j);
                totalTercetak++;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Total tercetak : "+totalTercetak);
        zaeInt.close();
    }
}
