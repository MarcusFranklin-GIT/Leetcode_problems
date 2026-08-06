import java.util.ArrayList;
import java.util.List;

public class min_numbers_of_binary_decimals {

    public static void findMinimumBinaryDecimals(int n) {
        List<Integer> parts = new ArrayList<>();
        
        // Continue extracting binary-decimals until the number is 0
        while (n > 0) {
            int temp = n;
            int currentBinaryDec = 0;
            int multiplier = 1;
            
            // Build a binary-decimal based on the non-zero digits of 'temp'
            while (temp > 0) {
                int digit = temp % 10; // Extract the last digit
                
                // If the digit is greater than 0, we need a '1' in this position
                if (digit > 0) {
                    currentBinaryDec += multiplier;
                }
                
                // Move to the next place value (tens, hundreds, etc.)
                multiplier *= 10; 
                temp /= 10;
            }
            
            // Add the constructed binary-decimal to our result list
            parts.add(currentBinaryDec);
            
            // Subtract it from the original number
            n -= currentBinaryDec;
        }
        
        // Print the output in the requested format
        System.out.print("Output: ");
        for (int i = 0; i < parts.size(); i++) {
            System.out.print(parts.get(i));
            if (i < parts.size() - 1) {
                System.out.print("+");
            }
        }
        System.out.println("\nCount : " + parts.size());
    }

    public static void main(String[] args) {
        int input = 32;
        System.out.println("Input: " + input);
        findMinimumBinaryDecimals(input);
        
        System.out.println("\n--- Testing another number ---");
        int input2 = 8273;
        System.out.println("Input: " + input2);
        findMinimumBinaryDecimals(input2);
    }
}