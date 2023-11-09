package Librerias;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz1 = new int[][] {{4, 6, 7, 8}, {4, 5, 3, 7}, {7, 4, 6, 2}};
        int[][] matriz2 = new int[][] {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};

        suma(matriz1, matriz2);
    }

    public static void suma(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m1[0].length];

        for (int i = 0; i < m1.length; i++) {
           for (int z = 0; z < m2[i].length; z++) {
               result[i][z] = m1[i][z] + m2[i][z];
               System.out.print(result[i][z] + "\t");
           }
           System.out.println();
        }
    }
}
