import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] originalArray = new int[rows][cols];
        Random random = new Random();

        // Инициализируем исходный массив случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Исходный массив:");
        printArray(originalArray);

        int randomRowToRemove = random.nextInt(rows);
        int randomColToRemove = random.nextInt(cols);

        // Создаем новый массив без выбранной строки и столбца
        int[][] newArray = new int[rows - 1][cols - 1];
        for (int i = 0, newRow = 0; i < rows; i++) {
            if (i == randomRowToRemove) {
                continue; // Пропускаем удаляемую строку
            }
            for (int j = 0, newCol = 0; j < cols; j++) {
                if (j == randomColToRemove) {
                    continue; // Пропускаем удаляемый столбец
                }
                newArray[newRow][newCol] = originalArray[i][j];
                newCol++;
            }
            newRow++;
        }

        System.out.println("\nНовый массив:");
        printArray(newArray);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
