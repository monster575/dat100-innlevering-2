package no.hvl.dat100.matriser;
public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int tall : rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                sb.append(matrise[i][j]);
                if (j < matrise[i].length - 1) {
                    sb.append(" ");
                }
            }
            sb.append(" \n");
        }
        return sb.toString();
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
            int[][] ny = new int[matrise.length][];
            for (int i = 0; i < matrise.length; i++) {
                ny[i] = new int[matrise[i].length];
                for (int j = 0; j < matrise[i].length; j++) {
                    ny[i][j] = matrise[i][j] * tall;
                }
            }
            return ny;
        }


    // d)
    public static boolean erLik(int[][] a, int[][] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[i].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}
