import java.io.*;
import java.util.*;

class Result {
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        Map<String, Integer> frequency = new HashMap<>();

        for (String s : stringList) {
            frequency.put(s, frequency.getOrDefault(s, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        for (String query : queries) {
            result.add(frequency.getOrDefault(query, 0));
        }

        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        int n = Integer.parseInt(br.readLine().trim());

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            stringList.add(br.readLine().trim());
        }

        int q = Integer.parseInt(br.readLine().trim());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            queries.add(br.readLine().trim());
        }

        List<Integer> result = Result.matchingStrings(stringList, queries);

        for (int value : result) {
            bw.write(String.valueOf(value));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
