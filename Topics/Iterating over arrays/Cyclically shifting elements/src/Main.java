import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] result = createCyclicallyArray(scanner, arraySize);
        for (int element : result) {
            System.out.print(element + " ");
        }
    }

    public static int[] createCyclicallyArray(Scanner scanner, int arraySize) {
        int[] array = new int[arraySize];
        for (int index = 0; index < arraySize; index++) {
            if (index == arraySize - 1) {
                array[0] = scanner.nextInt();
            } else {
                array[index + 1] = scanner.nextInt();

            }
        }
        return array;
    }

}