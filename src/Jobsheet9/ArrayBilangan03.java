package Jobsheet9;

import java.util.Arrays;

public class ArrayBilangan03 {
    public static void main(String[] args) {
        
        int bil [] = {3,11,-4,233};


        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil["+i+"] = "+bil[i]);
        }

        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
