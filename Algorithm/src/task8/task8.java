package task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        int i=0;
        while (i < n)
        {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            i++;
        }
//        for (int j = 0; j < n; j++)
//        {
//            System.out.println("x= " + x[j] + "; y= " + y[j]);
//            System.out.println("");
//        }
        Arrays.sort(x);
        Arrays.sort(y);
        int min_x = x[0];
        int min_y = y[0];
        int max_x = x[n - 1];
        int max_y = y[n - 1];
        System.out.println(min_x + " " + min_y + " " + max_x + " " + max_y);
    }
}
