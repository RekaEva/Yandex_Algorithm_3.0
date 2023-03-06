package task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class task9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String [] line = str.split(" ");
        int a = Integer.valueOf(line[0]);
        int b = Integer.valueOf(line[1]);
        int c = Integer.valueOf(line[2]);
        int [][] mas = new int[a][b];
        int [][] p_sum = new int[a][b + 1];

        for (int i = 0; i < a; i++)
        {
            int [] arr = new int[b];
            int [] pref = new int[b + 1];
            str  = reader.readLine();
            String [] str2 = str.split(" ");
            int sum = 0;
            int j;
            for (j = 0; j < b; j++)
            {
                arr[j] = Integer.valueOf(str2[j]);
                if (j == 0)
                    pref[j] = 0;
                else
                    pref[j] = pref[j - 1] + arr[j - 1];
            }
            pref[j] = pref[j - 1] + arr[j - 1];
            p_sum[i] = pref;
            mas[i] = arr;
        }
        int [][] arr_c = new int[c][4];
        for (int i = 0; i < c; i++)
        {
            int [] coord = new int[4];
            str  = reader.readLine();
            String [] str3 = str.split(" ");
            for (int j = 0; j < 4; j++)
            {
                coord[j] = Integer.valueOf(str3[j]) - 1;
            }
            arr_c[i] = coord;
        }

        for (int i = 0; i < c; i++)
        {
            int x1 = arr_c[i][0];
            int y1 = arr_c[i][1];
            int x2 = arr_c[i][2];
            int y2 = arr_c[i][3] + 1;
            int sum = 0;
            for (int k = x1; k <= x2; k++)
            {
                int tmp = p_sum[k][y2] - p_sum[k][y1];
                sum += tmp;
            }
            System.out.println(sum);
        }
    }
}
