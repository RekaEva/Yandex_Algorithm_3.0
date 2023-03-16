import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class task24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_n = reader.readLine();
        int n = Integer.valueOf(s_n);
        int a[]= new int[n + 1];
        int b[]= new int[n + 1];
        int c[] = new int[n + 1];
        int i = 1;
        while (i <= n)
        {
            String str = reader.readLine();
            String [] str1 = str.split(" ");
            a[i] = Integer.valueOf(str1[0]);
            b[i] = Integer.valueOf(str1[1]);
            c[i] = Integer.valueOf(str1[2]);
            i++;
        }
        if (n == 1)
        {
            System.out.println(a[1]);
            System.exit(0);
        }
        int [] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = a[1];
        dp[2] = min(a[1] + a[2], b[1]);
        i = 3;
        for (; i <= n; i++)
        {
            dp[i] = min(dp[i - 1] + a[i], min(dp[i -2] + b[i -1], dp[i - 3] + c[i -2]));
        }
        System.out.println(dp[n]);
    }
    public static int min(int a, int b)
    {
        if (a < b)
            return a;
        else
            return b;
    }
}