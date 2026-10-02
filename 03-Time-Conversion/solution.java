import java.io.*;
import java.util.*;

class Result {
    public static String timeConversion(String s) {
        // Extract the hour and AM/PM period from the input
        int hour = Integer.parseInt(s.substring(0, 2));
        String period = s.substring(8, 10);

        if (period.equals("AM")) {
            // Convert 12 AM to 00 hours
            if (hour == 12) {
                hour = 0;
            }
        } else {
            // Convert PM hours to 24-hour format
            if (hour != 12) {
                hour += 12;
            }
        }

        // Return the converted time in 24-hour format
        return String.format("%02d%s", hour, s.substring(2, 8));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        // Set up input and output streams
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new FileWriter(System.getenv("OUTPUT_PATH"))
        );

        // Read the time string
        String s = br.readLine().trim();

        // Convert the time to 24-hour format
        String result = Result.timeConversion(s);

        // Write the converted time
        bw.write(result);
        bw.newLine();

        // Close input and output streams
        br.close();
        bw.close();
    }
}
