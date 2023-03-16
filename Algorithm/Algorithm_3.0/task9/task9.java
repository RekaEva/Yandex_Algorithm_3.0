import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task9new {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        String [] line = str.split(" ");
        int a = Integer.valueOf(line[0]);
        int b = Integer.valueOf(line[1]);
        int c = Integer.valueOf(line[2]);
        int [][] mas = new int[a + 1][b + 1];
        Arrays.fill(mas[0],0 );
        for (int i = 1; i <= a; i++)
        {
            int [] arr = new int[b + 1];
            str  = reader.readLine();
            String [] str2 = str.split(" ");
            int sum = 0;
            int j;
            arr[0] = 0;
            for (j = 1; j <= b; j++)
            {
                arr[j] = Integer.valueOf(str2[j - 1]);
            }
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
                coord[j] = Integer.valueOf(str3[j]);
            }
            arr_c[i] = coord;
        }
        int[][] pref = new int[a + 1][b + 1];
        Arrays.fill(pref[0],0 );
        for (int i = 1; i <= a; i++)
        {
            int tmp = 0;
            pref[i][0] = 0;
            for (int j = 1; j <= b; j++)
            {
                int q = pref[i - 1][j];
                int cu = mas[i][j];
                int prev = pref[i - 1][j - 1];
                pref[i][j] = q + tmp + cu - prev;
                tmp = pref[i][j];
            }
        }
        System.out.println("");
        for  (int i = 0; i < c; i++)
        {
            int sum = 0;
            int x1 = arr_c[i][0];
            int y1 = arr_c[i][1];
            int x2 = arr_c[i][2];
            int y2 = arr_c[i][3];
            sum = pref[x2][y2] - pref[x2][y1 - 1] - pref[x1-1][y2] + pref[x1-1][y1 - 1];
            System.out.println(sum);
        }
    }
}