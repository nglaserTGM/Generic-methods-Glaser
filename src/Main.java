package src;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Test reverse method with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Integer array: " + Arrays.toString(intArray));
        GenericUtils.reverse(intArray);
        System.out.println("Reversed Integer array: " + Arrays.toString(intArray));

        // Test reverse method with String array
        String[] stringArray = {"apple", "banana", "cherry"};
        System.out.println("\nOriginal String array: " + Arrays.toString(stringArray));
        GenericUtils.reverse(stringArray);
        System.out.println("Reversed String array: " + Arrays.toString(stringArray));

        // Test sum method with Integer array
        Integer[] intArrayForSum = {1, 2, 3, 4, 5};
        double intSum = GenericUtils.sum(intArrayForSum);
        System.out.println("\nSum of Integer array: " + intSum);

        // Test sum method with Double array
        Double[] doubleArray = {1.5, 2.5, 3.5};
        double doubleSum = GenericUtils.sum(doubleArray);
        System.out.println("Sum of Double array: " + doubleSum);

        // Test sum method with Float array
        Float[] floatArray = {1.5f, 2.5f, 3.5f};
        double floatSum = GenericUtils.sum(floatArray);
        System.out.println("Sum of Float array: " + floatSum);
    }
}
