import java.io.*;
import java.util.*;

class Result {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice = 0;
        int bob = 0;

        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }

        return Arrays.asList(alice, bob);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        List<Integer> a = new ArrayList<>();
        for (String value : br.readLine().trim().split(" ")) {
            a.add(Integer.parseInt(value));
        }

        List<Integer> b = new ArrayList<>();
        for (String value : br.readLine().trim().split(" ")) {
            b.add(Integer.parseInt(value));
        }

        List<Integer> result = Result.compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bw.write(String.valueOf(result.get(i)));

            if (i < result.size() - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        br.close();
        bw.close();
    }
}
