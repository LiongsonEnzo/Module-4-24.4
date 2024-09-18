public class DisplayPrimes {
    public static void main(String[] args) {
        // Create a stack to store prime numbers
        GenericStack<Integer> stack = new GenericStack<>();

        // Find the first 50 prime numbers
        int count = 0;
        int number = 2; // Start with the first prime number

        while (count < 50) {
            if (PrimeNumbers.isPrime(number)) {
                stack.push(number); // Add the prime number to the stack
                count++;
            }
            number++;
        }

        // Display the primes in descending order by popping from the stack
        System.out.println("The first 50 prime numbers in descending order are:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
