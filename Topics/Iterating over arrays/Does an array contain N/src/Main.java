import java.util.Scanner;  

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int[] array = createArray(scanner, lengthOfArray);
        System.out.print(isEqual(scanner, array));
    }

    public static int[] createArray(Scanner scanner, int lengthOfArray) {
        int[] array = new int[lengthOfArray];
        for (int iteration = 0; iteration < lengthOfArray; iteration++) {
            array[iteration] = scanner.nextInt();
        }
        return array;
    }

    public static boolean isEqual(Scanner scanner, int[] array) {
        int inputVal = scanner.nextInt();
        boolean result = false;
        for (int number : array) {
            if (number == inputVal) {
                result = true;
            }
        }
        return result;
    }
}

