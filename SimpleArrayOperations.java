public class SimpleArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of array elements: " + sum);
        
        double average = sum / (double) numbers.length;
        System.out.println("Average of array elements: " + average);
    }
}
