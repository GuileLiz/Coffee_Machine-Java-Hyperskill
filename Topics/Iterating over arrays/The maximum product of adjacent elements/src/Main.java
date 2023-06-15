import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int initial = 0; initial<arrayLength; initial++) {
            array[initial] = scanner.nextInt();
        }
        int initial = arrayLength;
        int product = array[initial-1] * array[initial-2]; 
        for (; initial > 2; initial--) {
            if (product < array[initial-3] * array[initial-2]) {
                product = array[initial-3] * array[initial-2];
            }
        }
        System.out.print(product);
    }
}
