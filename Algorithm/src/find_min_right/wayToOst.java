package find_min_right;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class wayToOst {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int set = Integer.valueOf(in.nextLine());
        String input = in.nextLine();
        String[] str = input.split(" ");
        Stack<Integer> key = new Stack<>();
        Stack<Integer> val = new Stack<>();
        for (int i = set - 1; i >= 0; i--) {
            key.push(i);
            val.push(Integer.valueOf(str[i]));
        }
        int fin[] = new int[set] ;
        Arrays.fill(fin, -1);
        Stack<Integer> stack_v = new Stack<>();
        Stack<Integer> stack_k = new Stack<>();
        int i = 0;
        while (!val.empty() || i < set)
        {
            if (!stack_v.empty() &&  !stack_k.empty() && stack_v.lastElement() <= val.lastElement())
            {
                stack_v.push(val.pop());
                stack_k.push(key.pop());
            }
            else if (!stack_v.empty() && !stack_k.empty() && stack_v.lastElement() > val.lastElement())
            {
                while (!stack_v.empty() && (stack_v.lastElement() > val.lastElement() || stack_v.empty()))
                {
                    fin[stack_k.pop()] =  key.lastElement();
                    stack_v.pop();
                }
            }
            else{
                stack_v.push(val.pop());
                stack_k.push(key.pop());
            }
            i++;
        }
        for (i = 0; i < fin.length; i++) {
            System.out.print(fin[i] + " ");
        }
    }
}
