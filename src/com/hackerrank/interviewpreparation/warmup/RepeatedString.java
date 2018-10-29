package com.hackerrank.interviewpreparation.warmup;

/**
 * @author rpatra16
 * @since 29/10/2018
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int rem;
        long totalCount = 0, count = 0, s_length = s.length();
        // count the no of a in non-repeated string
        for (int i = 0; i < s_length; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        totalCount += (n / s_length * count);
        rem = (int) (n % s_length);
        // count the no of a in the remainder of the string
        for (int i = 0; i < rem; i++) {
            if (s.charAt(i) == 'a') {
                totalCount++;
            }
        }
        return totalCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

