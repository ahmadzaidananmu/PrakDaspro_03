package Jobsheet10;

public class Array3D {
    public static void main(String[] args) {
        
        int p[][][]={
            {{1,2,3},
            {4,5,6},
            {7,8,9}},
            
            {{10,11,12},
            {13,14,15},
            {16,17,18}},
            
            {{19,20,21},
            {22,23,24},
            {25,26,27}}
        };
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                for (int j2 = 0; j2 < p.length; j2++) {
                    System.out.print(p[i][j][j2]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
