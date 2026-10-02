import java.io.*;
import java.util.*;

class Result {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Create n empty sequences
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        // Store the last answer and all query results
        int lastAnswer = 0;
        List<Integer> answers = new ArrayList<>();

        // Process each query
        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            // Find the sequence index using XOR with lastAnswer
            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                // Append y to the selected sequence
                arr.get(idx).add(y);
            } else {
                // Retrieve the required value from the selected sequence
                List<Integer> sequence = arr.get(idx);
                lastAnswer = sequence.get(y % sequence.size());
                answers.add(lastAnswer);
            }
        }

        return answers;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Set up input and output streams
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        // Read the number of sequences and queries
        String[] firstLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int q = Integer.parseInt(firstLine[1]);

        List<List<Integer>> queries = new ArrayList<>();

        // Read all queries
        for (int i = 0; i < q; i++) {
            String[] values = br.readLine().trim().split(" ");

            List<Integer> query = new ArrayList<>();
            query.add(Integer.parseInt(values[0]));
            query.add(Integer.parseInt(values[1]));
            query.add(Integer.parseInt(values[2]));

            queries.add(query);
        }

        // Process the queries and get the results
        List<Integer> result = Result.dynamicArray(n, queries);

        // Write each result on a new line
        for (int value : result) {
            bw.write(String.valueOf(value));
            bw.newLine();
        }

        // Close input and output streams
        br.close();
        bw.close();
    }
}
