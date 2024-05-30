import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        replaceElements();
    }

    public static void replaceElements() {
        int[] array = new int[20];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21)-10;
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(array));

        int minValue = 10;
        int minPosition = 0;
        int maxValue = -10;
        int maxPosition = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minPosition = i;
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxPosition = i;
            }
        }
        System.out.printf("Минимальное значение массива - '%s", minValue);
        System.out.println();
        System.out.printf("Максимальное значение массива - '%s'", maxValue);
        System.out.println();
        array[minPosition] = maxValue;
        array[maxPosition] = minValue;
        System.out.println("Измененный массив:");


        System.out.println(Arrays.toString(array));
    }
}