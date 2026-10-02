import java.io.*;
import java.util.*;

class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Store the comparison points for Alice and Bob
        int alice = 0;
        int bob = 0;

        // Compare the three ratings
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                // Alice gets a point when her rating is higher
                alice++;
            } else if (a.get(i) < b.get(i)) {
                // Bob gets a point when his rating is higher
                bob++;
            }
        }

        // Return Alice's score followed by Bob's score
        return Arrays.asList(alice, bob);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Set up input and output streams
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        // Read Alice's ratings
        List<Integer> a = new ArrayList<>();
        for (String value : br.readLine().trim().split(" ")) {
            a.add(Integer.parseInt(value));
        }

        // Read Bob's ratings
        List<Integer> b = new ArrayList<>();
        for (String value : br.readLine().trim().split(" ")) {
            b.add(Integer.parseInt(value));
        }

        // Calculate the comparison scores
        List<Integer> result = Result.compareTriplets(a, b);

        // Write the scores in the required format
        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i)));

            if (i < result.size() - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        // Close input and output streams
        br.close();
        bw.close();
    }
}
