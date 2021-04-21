package util;

import java.util.Arrays;

public class PrintUtil {

    private static final  String replace = "\\{\\}";


    private enum Level {
        SOIUT("consoult");
        private String s;

        Level(String s) {
            this.s = s;
        }
    }

    public static void p(String format, Object... arguments) {
        info(Level.SOIUT, format, arguments);
    }

    private static void info(Level info, String format, Object[] arguments) {
        switch (info){
            case SOIUT:
                for (int i = 0; i < arguments.length; i++) {
                    format = format.replaceFirst(replace,arguments[i].toString());
                }
                System.out.println(format);
            default:
                return;
        }
    }


    public static void pIntArray(int[][] a) {
        if (a != null) {
            for (int[] element : a) {
                System.out.println(Arrays.toString(element));
            }
        }
    }

    public static void pLine() {
        System.out.println("----------------------------------------------------------------------------------------");
    }


}
