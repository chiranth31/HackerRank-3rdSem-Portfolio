import java.io.*;
import java.util.*;
import java.util.stream.*;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Get the size of the square matrix
        int n = arr.size();
        
        // Store the sums of the primary and secondary diagonals
        int primary = 0;
        int secondary = 0;

        // Calculate both diagonal sums
        for (int i = 0; i < n; i++) {
            primary += arr.get(i).get(i);
            secondary += arr.get(i).get(n - 1 - i);
        }

        // Return the absolute difference between the diagonal sums
        return Math.abs(primary - secondary);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Set up input and output streams
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        // Read the matrix size
        int n = Integer.parseInt(br.readLine().trim());
        List<List<Integer>> arr = new ArrayList<>();

        // Read all elements of the matrix
        for (int i = 0; i < n; i++) {
            String[] values = br.readLine().trim().split(" ");
            List<Integer> row = new ArrayList<>();

            for (String value : values) {
                row.add(Integer.parseInt(value));
            }

            arr.add(row);
        }

        // Calculate the diagonal difference
        int result = Result.diagonalDifference(arr);

        // Write the result
        bw.write(String.valueOf(result));
        bw.newLine();

        // Close input and output streams
        br.close();
        bw.close();
    }
}
