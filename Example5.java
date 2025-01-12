import java.util.Arrays;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;

        int[][] array = new int[rows][cols];

        Random random = new Random();

        // Заполняем массив случайными числами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        // Создаем новый массив для результата
        int[][] newArray = new int[cols][rows];

        // Заполняем новый массив значениями из исходного массива
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                newArray[i][j] = array[j][i];
            }
        }

        // Выводим преобразованный массив
        System.out.println("Преобразованный массив:");
        for (int i = 0; i < cols; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }
}
