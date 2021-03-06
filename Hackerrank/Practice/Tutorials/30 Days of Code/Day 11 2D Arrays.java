﻿import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

         for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

        scan.close();
    int sum = 0, maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if ((i + 2) < 6 && (j + 2) < 6) {
					sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
							+ arr[i + 2][j + 1] + arr[i + 2][j + 2];
				}
				if (sum > maxSum) {
					maxSum = sum;
				}
			}

		}
		System.out.println(maxSum);
    }
}
