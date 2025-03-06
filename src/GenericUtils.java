package src;
import java.util.Arrays;
public class GenericUtils {
    // Method to reverse an array of generic type in-place
    public static <T> void reverse(T[] array) {
        int left = 0;
        int right = array.length - 1;

        // Swap elements from both ends towards the middle
        while (left < right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Method to calculate the sum of an array of Numbers and return it as a double
    public static <T extends Number> double sum(T[] array) {
        double total = 0.0;

        // Add each element's double value to the total
        for (T num : array) {
            total += num.doubleValue();
        }

        return total;
    }
}
