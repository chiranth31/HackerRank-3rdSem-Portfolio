import java.io.*;
import java.util.*;

class Result {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Store the frequency of each string
        Map<String, Integer> frequency = new HashMap<>();

        // Count occurrences of each string
        for (String s : stringList) {
            frequency.put(s, frequency.getOrDefault(s, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        // Find the frequency of each query string
        for (String query : queries) {
            result.add(frequency.getOrDefault(query, 0));
        }

        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Set up input and output streams
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        // Read the number of strings
        int n = Integer.parseInt(br.readLine().trim());

        List<String> stringList = new ArrayList<>();

        // Read all strings
        for (int i = 0; i < n; i++) {
            stringList.add(br.readLine().trim());
        }

        // Read the number of queries
        int q = Integer.parseInt(br.readLine().trim());

        List<String> queries = new ArrayList<>();

        // Read all query strings
        for (int i = 0; i < q; i++) {
            queries.add(br.readLine().trim());
        }

        // Calculate the frequency for each query
        List<Integer> result = Result.matchingStrings(stringList, queries);

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
