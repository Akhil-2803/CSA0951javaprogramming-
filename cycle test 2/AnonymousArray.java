public class AnonymousArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        printArray(new int[]{6, 7, 8, 9, 10});
        int sum = 0;
        for (int num : new int[]{11, 12, 13, 14, 15}) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
    private static void printArray(int[] arr) {
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
}
}