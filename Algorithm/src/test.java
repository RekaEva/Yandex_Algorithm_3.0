import java.util.Scanner;
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

//public class test {
//    public static void main(String[] args) {
//        // массив для хранения операндов и знаков
////        String[] expression = {"6", "3", "1", "4", "5", "*", "+", "*", "2", "*", "+"};
//        String[] expression = {"8", "9", "+", "1", "7", "-", "*"};
//        int result = 0;
//        // стек для хранения результатов вычислений
//        Stack<Integer> stack = new Stack<>();
//        for (String s : expression) {
//            // если элемент - операнд, то добавляем его в стек
//            if (!isOperator(s)) {
//                stack.push(Integer.valueOf(s));
//            } else { // иначе - производим арифметическую операцию
//                int a = stack.pop();
//                int b = stack.pop();
//                switch (s) {
//                    case "+":
//                        result = a + b;
//                        break;
//                    case "-":
//                        result = b - a;
//                        break;
//                    case "*":
//                        result = a * b;
//                        break;
//                    case "/":
//                        result = b / a;
//                        break;
//                }
//                // и добавляем результат операции в стек
//                stack.push(result);
//            }
//        }
//        System.out.println("Result: " + stack.pop());
//    }
//    private static boolean isOperator(String s) {
//        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
//    }
//}

//
//    int week = 0;
//    String line;
//    long allGrades = 0;
//
//    Scanner input = new Scanner(System.in);
//        line = readString(input);
//                while (week < maxWeeks && !"42".equals(line)) {
//        week++;
//        if (!("Week " + week).equals(line)) {
//        error();
//        }
//        allGrades *= 10;
//        allGrades += getMin(input);
//        line = readString(input);
//        }
//        input.close();


//public class test {
//
//    // Находит и возвращает максимальный элемент в куче
//    public int findMaxElement(int[] heap) {
//        int max = Integer.MIN_VALUE;
//
//        // Обходим кучу и ищем максимальный элемент
//        for (int i = 0; i < heap.length; i++) {
//            if (heap[i] > max) {
//                max = heap[i];
//            }
//        }
//
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int[] heap = {1, 4, 5, 65, 10};
//
//        test maxHeapFinder = new test();
//        System.out.println("Max Element: " + maxHeapFinder.findMaxElement(heap));
//    }
//}

//public class test {
//
//    //процедура нахождения максимального элемента
//    public static int findMaxElement(int[] heap) {
//        int max = heap[0];
//
//        for (int i = 1; i < heap.length; i++) {
//            if (heap[i] > max) {
//                max = heap[i];
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int[] heap = {1, 4, 3, 5, 7, 66, 8};
//
//        System.out.println("Максимальный элемент в куче: " + findMaxElement(heap));
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//class Main
//{
//    public static void main(String[] args)
//    {
//        List<String> colors = new ArrayList<>(Arrays.asList("Blue", "Red", "Green"));
//
//        // обход списка с использованием конструкции for-each
//        for (String i: colors) {
//            System.out.println(i);
//        }
//    }
//}
public class test {
    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);

            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        return i + 1;
    }
}
//2 4 6 8 0
//        1 3 5 7 9

//1 7 3 9 4
//        5 8 0 2 6

//1 3 5 7 9
//        2 4 6 8 0

//2
//        0 10000
//        1

//14
//        0 1
//        0 345
//        1
//        0 4346
//        1
//        0 2435
//        1
//        0 235
//        0 5
//        0 365
//        1
//        1
//        1
//        1


//    public static void quickSort(int[] array, int start, int end) {
//        if (start < end) {
//            int partitionIndex = partition(array, start, end);
//
//            quickSort(array, start, partitionIndex-1);
//            quickSort(array, partitionIndex+1, end);
//        }
//    }
//    private static int partition(int[] array, int start, int end) {
//        int pivot = array[end];
//        int i = start-1;
//
//        for (int j=start; j<end; j++) {
//            if (array[j] <= pivot) {
//                i++;
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//
//        int temp = array[i+1];
//        array[i+1] = array[end];
//        array[end] = temp;
//
//        return i+1;
//    }