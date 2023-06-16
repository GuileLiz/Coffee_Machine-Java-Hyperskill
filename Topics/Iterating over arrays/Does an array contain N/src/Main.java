import java.util.Scanner;  

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        for (int iteration = 0; iteration < lengthOfArray; iteration++) {
            array[iteration] = scanner.nextInt();
        }
        int isEqual = scanner.nextInt();
        for (int initial = 0;  initial < lengthOfArray; initial++) {
            if (array[initial] == isEqual) {
                System.out.println(true);
                break;
            } else if (initial == lengthOfArray - 1 && array[initial] != isEqual) {
                System.out.println(false);
            }
        }
    }
}
