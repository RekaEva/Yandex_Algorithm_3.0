package yandex_stack;

import java.util.*;

public class stack_1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Stack<Integer> stack = new Stack<>();
        while (!"exit".equals(str)) {
            if (str.contains("push")) {
                String[] substr = str.split(" ");
                int n = Integer.valueOf(substr[1]);
                stack.push(n);
                System.out.println("ok");
            }
            if ("pop".equals(str)) {
                if (stack.empty()) {
                    System.out.println("error");
                    str = in.nextLine();
                    continue;
                }
                int p = stack.pop();
                System.out.println(p);
            }
            if ("back".equals(str)) {
                if (stack.empty()) {
                    System.out.println("error");
                    str = in.nextLine();
                    continue;
                }
                System.out.println(stack.lastElement());
            }
            if ("size".equals(str)) {
                System.out.println(stack.size());
            }
            if ("clear".equals(str)) {
                stack.clear();
                System.out.println("ok");
            }
            str = in.nextLine();
        }
        System.out.println("bye");
    }
}
