import java.util.Stack;

//public class test {
//    public static void main(String[] args) {
//            String infixExpression = "5 - 3"; // Инфиксное выражение
//            // Создаём стек для хранения операторов
//            Stack<Character> operatorsStack = new Stack<>();
//            // Строка для хранения результата
//            StringBuilder result = new StringBuilder();
//            for (int i = 0; i < infixExpression.length(); i++) {
//                char currentChar = infixExpression.charAt(i);
//                if (Character.isDigit(currentChar)) {
//                    result.append(currentChar);
//                } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
//                    while (!operatorsStack.empty() && isHigherPrecedence(operatorsStack.peek(), currentChar)) {
//                        result.append(operatorsStack.pop());
//                    }
//                    operatorsStack.push(currentChar);
//                }
//            }
//            while (!operatorsStack.empty()) {
//                result.append(operatorsStack.pop());
//            }
//            System.out.println("Postfix expression: " + result);
//        }
//        private static boolean isHigherPrecedence(char top, char current) {
//            if ((top == '*' || top == '/') && (current == '+' || current == '-')) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//}

public class test {
    public static void main(String[] args) {
        // массив для хранения операндов и знаков
//        String[] expression = {"6", "3", "1", "4", "5", "*", "+", "*", "2", "*", "+"};
        String[] expression = {"5", "3", "-"};
        int result = 0;
        // стек для хранения результатов вычислений
        Stack<Integer> stack = new Stack<>();
        for (String s : expression) {
            // если элемент - операнд, то добавляем его в стек
            if (!isOperator(s)) {
                stack.push(Integer.valueOf(s));
            } else { // иначе - производим арифметическую операцию
                int a = stack.pop();
                int b = stack.pop();
                switch (s) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                }
                // и добавляем результат операции в стек
                stack.push(result);
            }
        }
        System.out.println("Result: " + stack.pop());
    }
    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}