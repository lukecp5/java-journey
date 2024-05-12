/**
 * iterateOverArray
 */
public class iterateOverArray {
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] values2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] values3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] values4 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] values5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] values6 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] values7 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] values8 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] values9 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }

        // for (int j = values.length; j > 0; j--) {
        // values[j]--;
        // System.out.println("for (int j = values.length; j > 0; j--)\r\n" +
        // " values[j]--;");
        // System.out.println(", " + values[j]);
        // }

        System.out.println("for (int j = 0; j < values.length - 1; j++)\r\n" + //
                "    values[j]--;");
        for (int k = 0; k < values2.length - 1; k++) {
            values2[k]--;
            System.out.print(", " + values2[k]);
        }
        System.out.println();
        System.out.println("for (int j = values.length - 1; j >= 1; j--)\r\n" + //
                "    values[j]--;");
        for (int l = values3.length - 1; l >= 1; l--) {
            values3[l]--;
            System.out.print(", " + values3[l]);
        }
        System.out.println();
        System.out.println("for (int j = 1; j < values.length; j++)\r\n" + //
                "    values[j]--;");
        for (int m = 1; m < values4.length; m++) {
            values4[m]--;
            System.out.print(", " + values4[m]);
        }
        System.out.println();
        // System.out.println("for (int j = values.length; j >= 0; j--)\r\n" + //
        // " values[j]--;");
        // for (int n = values5.length; n >= 0; n--) {
        // values5[n]--;
        // System.out.print(", " + values5[n]);
        // }

        System.out.println("for (int j = values.length - 1; j > 0; j--)\r\n" + //
                "    values[j]--;");
        for (int o = values6.length - 1; o > 0; o--) {
            values6[o]--;
            System.out.print(", " + values6[o]);
        }
        System.out.println();
        System.out.println("for (int j = 1; j < values.length - 1; j++)\r\n" + //
                "    values[j]--;");
        for (int p = 1; p < values7.length - 1; p++) {
            values7[p]--;
            System.out.print(", " + values7[p]);
        }
        System.out.println();

        System.out.println("for (int j = 0; j < values.length + 1; j++)\r\n" + //
                "    values[j]--;");
        for (int q = 0; q < values8.length + 1; q++) {
            values8[q]--;
            System.out.print(", " + values8[q]);
        }
        System.out.println();

    }

}