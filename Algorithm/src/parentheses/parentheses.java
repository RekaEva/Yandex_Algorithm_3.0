package parentheses;
import java.util.*;

public class parentheses {
    public static void main(String[] args) {
        Stack stack = new Stack();
        String str;
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        char[] chars = str.toCharArray();
        for (int i=0; i < str.length(); i++){
            if (str.charAt(i) == '(')
                stack.push(1);
            if (str.charAt(i) == ')')
            {
                try {
                    stack.pop();
                }
                catch (EmptyStackException e)
                {
                    System.out.println("Ошибка");
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

//    String local="aaabrarkem,rkaorkweo,rejrai,";
//    StringBuilder bld=new StringBuilder(local);
//       for (int k=0;k<bld.length();k++){
//        if (bld.charAt(k)==',') bld.setCharAt(k, '.');
//        }
//        local= bld.toString();
//        System.out.println(local);