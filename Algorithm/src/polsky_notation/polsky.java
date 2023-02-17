package polsky_notation;

import java.util.Scanner;
import java.util.Stack;


public class polsky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = str = in.nextLine();
        Stack<Integer> stack = new Stack();
        int result = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!isOperator(str.charAt(i))) { // если элемент - операнд, то добавляем его в стек
                stack.push(Character.digit(chars[i], 10));
            }
            else{// иначе - производим арифметическую операцию
                int a = stack.pop();
                int b = stack.pop();
                switch (str.charAt(i)) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = b - a;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = b / a;
                        break;
                }
                // и добавляем результат операции в стек
                stack.push(result);
            }
        }
        System.out.println("Result: " + stack.pop());
    }
    private static boolean isOperator(char s){
        if (s == '+' || s == '*' || s == '-' || s == '/')
        {
            return true;
        }
        return false;
    }

}

