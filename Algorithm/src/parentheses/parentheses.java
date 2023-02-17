package parentheses;
import java.util.*;
import java.lang.Object;

public class parentheses {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack();
        String str;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        char[] chars = str.toCharArray();
        for (int i=0; i < str.length(); i++){
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
                stack.push(str.charAt(i));
            if (str.charAt(i) == ')' || str.charAt(i) == ']' ||  str.charAt(i) == '}' )
            {
                if (stack.empty() == true)
                    System.out.println("Ошибка");
                if (str.charAt(i) == ')' && stack.lastElement() == '(') {
                    stack.pop();
                    continue;
                }
                if (str.charAt(i) == ']' && stack.lastElement() == '[') {
                    stack.pop();
                    continue;
                }
                if (str.charAt(i) == '}' && stack.lastElement() == '{') {
                    stack.pop();
                    continue;
                }
                else
                {
                    System.out.println(" не верная последовательность");
                    System.exit(0);
                }
            }
        }
        System.out.println(stack.size());
        if (stack.empty())
            System.out.println("верно");
        else
            System.out.println("не верно");
    }
}


//// простые скобки (один вид)
//public class parentheses {
//    public static void main(String[] args) {
//        Stack stack = new Stack();
//        String str;
//        Scanner in = new Scanner(System.in);
//        str = in.nextLine();
//        char[] chars = str.toCharArray();
//        for (int i=0; i < str.length(); i++){
//            if (str.charAt(i) == '(')
//                stack.push(1);
//            if (str.charAt(i) == ')')
//            {
//                try {
//                    stack.pop();
//                }
//                catch (EmptyStackException e)
//                {
//                    System.out.println("Ошибка");
//                    System.exit(0);
//                }
//            }
//        }
//        System.out.println(stack.size());
//        if (stack.empty())
//            System.out.println("верно");
//        else
//            System.out.println("не верно");
//    }
//}

