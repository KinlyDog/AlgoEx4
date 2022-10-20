public class Func {
    public static boolean balance(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
                continue;
            }

            if (str.charAt(i) == ')' && stack.size() == 0) {
                return false;
            }

            stack.pop();
        }

        return (stack.size() == 0);
    }

    public static int postFix(String str) {
        Stack<Character> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        for (int i = str.length() - 1; i > -1; i--) {
            if (str.charAt(i) != ' ') {
                s1.push(str.charAt(i));
            }
        }

        while (s1.size() != 0) {
            int a = 0;
            char c = s1.pop();

            if (c == '=') break;

            if (c > 47 && c < 58) {
                s2.push(Character.getNumericValue(c));
                continue;
            }

            if (c == '+') {
                s2.push(s2.pop() + s2.pop());
            }

            if (c == '*') {
                s2.push(s2.pop() * s2.pop());
            }

            if (c == '-' || c == '/') {
                a = s2.pop();
            }

            if (c == '-') {
                s2.push(s2.pop() - a);
            }

            if (c == '/') {
                s2.push(s2.pop() / a);
            }
        }

        return s2.pop();
    }
}
