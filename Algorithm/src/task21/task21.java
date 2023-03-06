package task21;

import java.util.Scanner;

public class task21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        int ans;
        int [] f = new int[36];
        f[1] = 2; f[2] = 4; f[3] = 7;
        for (int i = 4; i <= n; i++)
        {
            f[i] = (f[i-1] + f[i-2] + f[i-3]);
        }
        System.out.println(f[n]);
    }
}
