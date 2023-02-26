

import java.util.Scanner;
import java.util.Stack;

public class trains {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int set = Integer.valueOf(in.nextLine());
        String input = in.nextLine();
        String[] str = input.split(" ");
        Stack<Integer> rail1 = new Stack<>();
        for (int i = set - 1; i >= 0; i--) {
            rail1.push(Integer.valueOf(str[i]));
        }
        Stack<Integer> stop = new Stack<>();
        Stack<Integer> rail2 = new Stack<>();
        int min = 1;
        while (rail2.size() != set)
        {
            if (!stop.empty() && stop.lastElement() == min )
            {
                rail2.push(stop.pop());
                min++;
            }
            else if (!rail1.empty()){
                stop.push(rail1.pop());
            }
            else if (rail1.empty() && stop.lastElement() != min)
            {
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
