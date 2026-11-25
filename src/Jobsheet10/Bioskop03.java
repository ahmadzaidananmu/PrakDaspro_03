package Jobsheet10;

public class Bioskop03 {
    public static void main(String[] args) {
        String penonton[][]=new String [4][2];
        penonton[0][0]= "Alok";
        penonton[0][1]= "Bobok";
        penonton[1][0]= "Colok";
        penonton[1][1]= "Doyok";
        penonton[2][0]= "Enrique";
        penonton[2][1]= "Filok";
        penonton[3][0]= "Golok";
        penonton[3][1]= "Halok";

        System.out.printf("%s\t%s\n",penonton[0][0],penonton[0][1]);
        System.out.printf("%s\t%s\n",penonton[1][0],penonton[1][1]);
        System.out.printf("%s\t%s\n",penonton[2][0],penonton[2][1]);
        System.out.printf("%s\t%s\n",penonton[3][0],penonton[3][1]);

        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris : "+barisPenonton.length);
       }

       System.out.println("Penonton pada baris ke-3 : ");
       for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
       }
    }
}
