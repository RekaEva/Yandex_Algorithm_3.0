import java.util.*;


public class task12 {
    public static void main(String[] args) {
        Stack<Character> stack = new  Stack();
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
                {
                    System.out.println("no");
                    System.exit(0);
                }
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
                    System.out.println("no");
                    System.exit(0);
                }
            }
        }
        if (stack.empty())
            System.out.println("yes");
        else
            System.out.println("no");
    }
}