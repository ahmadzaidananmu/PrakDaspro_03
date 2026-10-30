package Jobsheet8;
import java.util.Scanner;
public class Triangle03 {
    public static void main(String[] args) {
        Scanner zaeInt = new Scanner (System.in);

        System.out.print("Masukkan nilai N : ");
        int n = zaeInt.nextInt();

        int i = 1;
        while (i<=n) {
            int j =1;
            while (j<=i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = n;
        while (i>=1) {
            int j = i;
            while (j>=1) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
        zaeInt.close();
    }
}
