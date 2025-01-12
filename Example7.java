public class Example7 {
    public static void main(String[] args) {
        int numRows = 5;
        int numCols = 6;
        int[][] snakeArray = new int[numRows][numCols];
        int counter = 1;

        for (int i = 0; i < numRows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numCols; j++) {
                    snakeArray[i][j] = counter++;
                }
            } else {
                for (int j = numCols - 1; j >= 0; j--) {
                    snakeArray[i][j] = counter++;
                }
            }
        }

        // Вывод массива на экран
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(snakeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
