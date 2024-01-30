import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 2, 3, 4, 1, 2};
        int[] arrayWithoutDuplicates = removeDuplicates(arrayWithDuplicates);
        System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int element : array) {
            uniqueSet.add(element);
        }
        int[] resultArray = new int[uniqueSet.size()];
        int index = 0;
        for (int element : uniqueSet) {
            resultArray[index++] = element;
        }
        return resultArray;
    }
}
