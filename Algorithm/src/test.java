//import java.util.Scanner;
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
//public class test {
//    public static void quickSort(int[] array, int start, int end) {
//        if (start < end) {
//            int partitionIndex = partition(array, start, end);
//
//            quickSort(array, start, partitionIndex - 1);
//            quickSort(array, partitionIndex + 1, end);
//        }
//    }
//
//    private static int partition(int[] array, int start, int end) {
//        int pivot = array[end];
//        int i = start - 1;
//
//        for (int j = start; j < end; j++) {
//            if (array[j] <= pivot) {
//                i++;
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//
//        int temp = array[i + 1];
//        array[i + 1] = array[end];
//        array[end] = temp;
//
//        return i + 1;
//    }
//}
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
//        11
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



//2
//        3 1


//public class test
//
//{
//
////    public static int MAX = 100010;
//    public static int MAX = 100010;
//
//    static int f[] = new int[MAX];
//
//
//    public static void main(String[] args)
//
//    {
//
////        Scanner con = new Scanner(System.in);
////
////        int n = con.nextInt();
//
//        Scanner in = new Scanner(System.in);
//        int n = Integer.valueOf(in.nextLine());
//        f[1] = 2; f[2] = 4; f[3] = 7;
//
//        for(int i = 4; i <= n; i++)
//
//            f[i] = (f[i-1] + f[i-2] + f[i-3]) % 12345;
//
//        System.out.println(f[n]);
/////        con.close();
//
//    }
//
//}
//def pop(Heap):
//        if len(Heap) == 2:
//        return Heap.pop()
//        retval = Heap[1]
//        Heap[1] = Heap.pop()
//        i = 1
//        while 2 * i + 1 < len(Heap) \
//        and Heap[i] < max(Heap[2 * i], Heap[2 * i + 1]):
//        if Heap[2 * i] > Heap[2 * i + 1]:
//        Heap[i], Heap[2 * i] = Heap[2 * i], Heap[i]
//        i = 2 * i
//        else:
//        Heap[i], Heap[2 * i + 1] = Heap[2 * i + 1], Heap[i]
//        i = 2 * i + 1
//        if 2 * i == len(Heap) - 1 and Heap[i] < Heap[2 * i]:
//        Heap[i], Heap[2 * i] = Heap[2 * i], Heap[i]
//        return retval

//
//import java.util.*;
//
//
//
//class Main
//{
//    static int dp[] = new int[35];
//    public static void main(String[] args)
//    {
//        Scanner con = new Scanner(System.in);
//        int n = con.nextInt();
//        int k = con.nextInt();
//        int i;
//        dp[1] = 1; dp[2] = 1;
//        for(i = 3; i <= k; i++)
//            dp[i] = 2 * dp[i-1];
//        for(; i <= n; i++)
//            dp[i] = 2 * dp[i-1] - dp[i-k-1];
//        System.out.println(dp[n]);
//        con.close();
//
//    }
//}







import java.util.Scanner;

public class test {
    private static final int maximumCodeValue = 65535;
    private static final int maxDisplayHeight = 10;


    public static void main(String[] args) {
        String  line = "";

        Scanner input = new Scanner(System.in);
        if (input.hasNextLine()) {
            line = input.nextLine();
        } else {
            input.close();
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        input.close();
        short[] charOccur = countCharOccurrences(line);
        char[]  charsByPriority = sortCharsByPriority(charOccur);
        System.out.println();
        draw(charsByPriority, charOccur);
//        draw(null, charOccur);
    }
    private static short[] countCharOccurrences(String line) {
        short[] charOccurrences = new short[maximumCodeValue];

        for (int i = 0; i < line.length(); i++) {
            charOccurrences[line.toCharArray()[i]]++;
        }
        return charOccurrences;
    }

    private static char[] sortCharsByPriority(short[] charOccur) {
        char[] charsByPriority = new char[maximumCodeValue];

        for (int charValue = 0; charValue < maximumCodeValue; charValue++) {
            short occur = charOccur[charValue];
            if (occur > 0) {
                for (int pos = 0; pos < maximumCodeValue; pos++) {
                    if (charOccur[charsByPriority[pos]] < occur) {
                        charsByPriority = insertCharByPriority(charsByPriority, (char)charValue, pos);
                        break;
                    }
                }
            }
        }
        return charsByPriority;
    }

    private static char[] insertCharByPriority(char[] charArray, char c, int index) {
        char[] newCharArray  = new char[maximumCodeValue];

        for (int i = 0; i < index; i++) {
            newCharArray[i] = charArray[i];
        }
        newCharArray[index] = c;

        for (int i = index + 1; i < maximumCodeValue; i++) {
            newCharArray[i] = charArray[i - 1];
        }
        return newCharArray;
    }

    private static void draw(char[] charsByPriority, short[] charOccur) {
        short maxCharCount = charOccur[charsByPriority[0]];
        final int maxHeight = Math.min(maxCharCount, maxDisplayHeight);
        final int linesCount = maxHeight + 2;
        int[] graphs = new int[maximumCodeValue];

        for (int i = 0; i < maximumCodeValue; i++) {
            if (maxCharCount <= maxDisplayHeight)
                graphs[i] = charOccur[charsByPriority[i]];
            else
                graphs[i] = charOccur[charsByPriority[i]] * maxDisplayHeight / maxCharCount;
        }
        for (int line = linesCount; line > 0; line--) {
            for (int pos = 0; pos < maxDisplayHeight; pos++) {
                if (charsByPriority[pos] != 0) {
                    if (line == graphs[pos] + 2) {
                        System.out.printf("%4d", charOccur[charsByPriority[pos]]);
                    } else if (line == 1) {
                        System.out.printf("%4c", charsByPriority[pos]);
                    } else if (line < graphs[pos] + 2) {
                        System.out.printf("%4c", '#');
                    }
                }
            }
            System.out.println();
        }
    }
}
//
//    Scanner scanner = new Scanner(System.in);
//    String ab= scanner.nextLine();
//    int a=;
//
//while(ab != null){
//        System.out.printf("%d %s\n",++a,ab);
//        ab=scanner.nextLine();
//        }
//        scanner.close();
//        }


