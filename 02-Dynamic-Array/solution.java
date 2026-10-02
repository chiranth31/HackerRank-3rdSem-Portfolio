import java.io.*;
import java.util.*;

class Result {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
        }

        int lastAnswer = 0;
        List<Integer> answers = new ArrayList<>();

        for (List<Integer> query : queries) {
            int type = query.get(0);
            int x = query.get(1);
            int y = query.get(2);

            int idx = (x ^ lastAnswer) % n;

            if (type == 1) {
                arr.get(idx).add(y);
            } else {
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        String[] firstLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int q = Integer.parseInt(firstLine[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] values = br.readLine().trim().split(" ");

            List<Integer> query = new ArrayList<>();
            query.add(Integer.parseInt(values[0]));
            query.add(Integer.parseInt(values[1]));
            query.add(Integer.parseInt(values[2]));

            queries.add(query);
        }

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int value : result) {
            bw.write(String.valueOf(value));
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}
