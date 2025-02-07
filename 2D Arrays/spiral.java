class spiral {

    public static void printSpiral(int matrix[][]) {

        int sC = 0;
        int eC = matrix[0].length - 1;
        int sR = 0;
        int eR = matrix.length - 1;

        while (sC <= eC && sR <= eR) {

            // Traverse from left to right
            for (int i = sC; i <= eC; i++) {
                System.out.print(matrix[sR][i] + " ");
            }

            // Traverse from top to bottom
            for (int j = sR + 1; j <= eR; j++) {
                System.out.print(matrix[j][eC] + " ");
            }

            // Traverse from right to left
            for (int i = eC - 1; i >= sC; i--) {  
                if (sR == eR) {
                    break;
                }
                System.out.print(matrix[eR][i] + " ");
            }

            // Traverse from bottom to top
            for (int j = eR - 1; j > sR; j--) {
                if (sC == eC) {
                    break;
                }
                System.out.print(matrix[j][sC] + " ");
            }

            sC++;
            eC--;
            sR++;
            eR--;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        printSpiral(matrix);
    }
}
