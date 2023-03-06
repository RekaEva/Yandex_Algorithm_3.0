

import java.util.Scanner;
import java.util.Stack;

public class polsky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] arr_str = str.split(" ");
        int result = 0;
        Stack<Integer> stack = new Stack();
        for (String s1 : arr_str ) {
            if (!isOperator(s1)) { // если элемент - операнд, то добавляем его в стек
                stack.push(Integer.valueOf(s1));
            }
            else{// иначе - производим арифметическую операцию
                int a = stack.pop();
                int b = stack.pop();
                switch (s1) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = b - a;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = b / a;
                        break;
                }
                // и добавляем результат операции в стек
                stack.push(result);
            }
        }
        System.out.println(stack.pop());
    }
    private static boolean isOperator(String s){
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
        {
            return true;
        }
        return false;
    }
}

