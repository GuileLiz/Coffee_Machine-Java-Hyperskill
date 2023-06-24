import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] array = createArray(arraySize, scanner);
        int valueToCompare = scanner.nextInt();
        numberOfOccurence(valueToCompare, array);
    }

    public static int[] createArray(int arraySize, Scanner scanner) {
        int[] array = new int[arraySize];
        int tempMax = 0;
        for (int index = 0; index < array.length; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }

    public static void numberOfOccurence(int valueToCompare, int[] array) {
        int maxValue = 0;
        for (int element : array) {
            if (element > maxValue) {
               maxValue += 1;
               System.out.print(maxValue);
            }
        }
        System.out.print(maxValue);
    }
}
