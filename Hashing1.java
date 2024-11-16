package CountFreqOfElemetns;

import java.util.*;

public class Hashing1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find the maximum value in the array to create an appropriate hash array size
        int maxValue = Arrays.stream(arr).max().orElse(0);
        
        // Initialize hash array of size (maxValue + 1)
        int hash[] = new int[maxValue + 1];

        // Precompute the frequency of each element
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // Input number of queries
        int q = sc.nextInt();
        while (q-- > 0) {
            int num = sc.nextInt();
            // Check if the number is within the bounds of the hash array
            if (num >= 0 && num <= maxValue) {
                System.out.println(hash[num]);
            } else {
                System.out.println("0");  // Print 0 if the number is out of bounds
            }
        }
        sc.close();
    }
}
