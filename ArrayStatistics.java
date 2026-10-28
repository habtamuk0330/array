public class ArrayStatistics {
    public static void main(String[] args) {
        // 1. Declare and instantiate an integer array to store five integers
        int[] numbers = new int[5];

        // 2. Initialize the array
        numbers[0] = 12;
        numbers[1] = 25;
        numbers[2] = 8;
        numbers[3] = 40;
        numbers[4] = 15;

        // 3. Calculate the sum using a loop
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // 4. Find the largest and smallest values (no built-in methods)
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // 5. Calculate the average
        double average = (double) sum / numbers.length;

        // 6. Display the results
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
