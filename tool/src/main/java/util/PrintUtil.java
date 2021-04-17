package util;

import java.util.Arrays;

public class PrintUtil {
    public static void pIntArray(int[][] a) {
        if (a != null) {
            for (int[] element :
                    a) {
                System.out.println(Arrays.toString(element));
            }
        }
    }

    public static void pLine() {
        System.out.println("----------------------------------------------------------------------------------------");
    }
}
