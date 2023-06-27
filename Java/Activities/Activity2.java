package activities;

public class Activity2 {

    public static void main(String[] args) {
        int[] numbers = {10, 77, 10, 54, -11, 10};
        int sum = 0;

        for (int number : numbers) {
            if (number == 10) {
                sum += number;
            }
        }

        System.out.println("Sum of 10's in the array: " + sum);

        if (sum == 30) {
            System.out.println("The sum is equal to 30.");
        } else {
            System.out.println("The sum is not equal to 30.");
        }
    }
}

