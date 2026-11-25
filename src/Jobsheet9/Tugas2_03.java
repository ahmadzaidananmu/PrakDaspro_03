package Jobsheet9;
import java.util.Scanner;
public class Tugas2_03 {
    public static void main(String[] args) {
        Scanner zae = new Scanner (System.in);
        
        String menu[] = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int harga[] = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=======SELAMAT DATANG DI KAFE KAMPUS=======");
        System.out.println("Daftar menu : ");
        for (int i = 0; i < harga.length; i++) {
            System.out.println((i+1)+". "+menu[i]+" :Rp."+harga[i]);
        }
        System.out.println("=============================================");
        System.out.print("Ingin cari menu ? (y/t) : ");
        String pesan =zae.nextLine();

        while (pesan.equalsIgnoreCase("y")) {
            System.out.print("Masukkan menu yang dipesan : ");
            String keywords=zae.nextLine();

            int indeks=-1;
            for (int i = 0; i < harga.length; i++) {
                if (menu[i].equalsIgnoreCase(keywords)) {
                    indeks=i;
                    break;
                }
            }
            if (indeks!=-1) {
                System.out.println("Menu "+menu[indeks]+" Ditemukan :Rp."+harga[indeks]);
            }else System.out.println("Menu "+keywords+" tidak tersedia");

            System.out.print("Ingin cari menu yang lain ? (y/t) : ");
            pesan=zae.nextLine();
        }
        System.out.print("\nMasukkan jumlah item yang ingin dibeli : ");
        int jumlahItem=zae.nextInt();
        zae.nextLine();

        String pesanan[]=new String[jumlahItem];
        int hargaPesanan[]=new int[jumlahItem];
        int totalHarga=0;

        for (int i = 0; i < jumlahItem; i++) {
            boolean valid=false;
            while (!valid) {
                System.out.print("Masukkan nama pesanan"+(i+1)+" : ");
                String inputMenu=zae.nextLine();    

                int indeksMenu = -1;
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(inputMenu)) {
                        indeksMenu = j;
                        break;
                    }
                }
                if (indeksMenu != -1) {
                    pesanan[i] = menu[indeksMenu];
                    hargaPesanan[i] = harga[indeksMenu];
                    totalHarga += harga[indeksMenu];
                    valid = true;
            }else System.out.println("Menu tidak valid, input ulang");
            }
        }
        System.out.println("\n=========================================");
        System.out.println("             STRUK PEMESANAN             ");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < harga.length; i++) {
            System.out.println((i+1)+". "+menu[i]+" :Rp."+harga[i]);
        }

        System.out.println("-----------------------------------------");
        System.out.println("TOTAL BIAYA         :Rp."+totalHarga);
        System.out.println("=========================================");

        zae.close();
    }
}
