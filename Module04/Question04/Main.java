import java.util.Arrays;

public class Main {
    public static <T> void swapElements(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        System.out.println("Before swap: " + Arrays.toString(nums));
        swapElements(nums, 1, 3);
        System.out.println("After swapping index 1 and 3: " + Arrays.toString(nums));

        String[] words = {"apple", "banana", "cherry"};
        System.out.println("Before swap: " + Arrays.toString(words));
        swapElements(words, 0, 2);
        System.out.println("After swapping index 0 and 2: " + Arrays.toString(words));
    }
}
