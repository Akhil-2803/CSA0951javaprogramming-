import java.util.Arrays;
import java.util.Collections;
public class shuffle {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        Collections.shuffle(Arrays.asList(array));
        System.out.println("Shuffled Array: " + Arrays.toString(array));
}
}