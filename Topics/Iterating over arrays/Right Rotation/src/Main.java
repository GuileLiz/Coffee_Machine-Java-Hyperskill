import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int effectiveSteps = steps % arr.length;
        //temporaty array to store shifted array
        int[] tempArray = new int[arr.length];
        //concatenating from start until effective steps and transfer to index effective steps until end
        System.arraycopy(arr, 0, tempArray, effectiveSteps, arr.length - effectiveSteps);
        //concatenating from effective until end and
        System.arraycopy(arr, arr.length - effectiveSteps, tempArray, 0,  effectiveSteps);
        System.arraycopy(tempArray, 0, arr, 0, arr.length);

    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}