import java.io.*;
import java.util.*;

class Result {
    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String period = s.substring(8, 10);

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        } else {
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d%s", hour, s.substring(2, 8));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        String s = br.readLine().trim();

        String result = Result.timeConversion(s);

        bw.write(result);
        bw.newLine();

        br.close();
        bw.close();
    }
}
