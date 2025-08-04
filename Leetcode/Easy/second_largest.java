class Solution {
    public int getSecondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        
    }
    if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        } 
        else{
            return secondLargest;
        }
        }
    }

    // This code finds the second largest number in an array.
    // It initializes two variables to track the largest and second largest numbers.