public class Func {
    public static boolean balance(String str) {
        Stack stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
                continue;
            }

            if (str.charAt(i) == ')' && stack.size() == 0) {
                return false;
            }

            stack.pop();
        }

        return (stack.size() == 0);
    }
}
