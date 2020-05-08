import java.util.Scanner;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 9, 34, 4, 12, 23};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int input = sc.nextInt();
        int count = 0;
        boolean inTheArray = false;

        for (int i = 0; i < array.length; i++) {
            int index;
            if (input == array[i]) {
                inTheArray = true;
                count++;
                for (index = i; index < array.length - 1; index++) {
                    array[index] = array[index + 1];
                }
            }
        }

        if (inTheArray) {
            System.out.println("The value is in the array");
            System.out.println("New array without the value is: ");
            for (int j = 0; j < array.length - count; j++) {
                System.out.print(array[j] + "\t");
            }
        }
        else
            System.out.println("The value is not in the array");
    }
}
