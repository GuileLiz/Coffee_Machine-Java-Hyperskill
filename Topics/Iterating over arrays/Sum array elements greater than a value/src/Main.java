import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        //input for size of array
        int arraySize = scanner.nextInt();
        //array is created base on input depending on the size
        int[] array = createArray(scanner, arraySize);
        //use do determine ths sum that is greater than input value
        int greaterThan = scanner.nextInt();
        int result = sumGreaterThanN(greaterThan,array);
        System.out.print(result);
    }

    //Creating array base on the input size
    public static int[] createArray(Scanner scanner, int arraySize) {
        int[] array = new int[arraySize];
        int sum = 0;
        for (int index=0; index < arraySize; index++) {
            array[index] = scanner.nextInt();
        }
        return array;
    }

    //return the sum that is greater than N
    public static int sumGreaterThanN(int greaterThan, int[] array) {
        int sum = 0;
        for (int element : array) {
            if (element > greaterThan) {
                sum += element;
            }
        }
        return sum;
    }
}