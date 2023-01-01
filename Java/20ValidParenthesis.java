/* Essentially, we just keep a stack of what characters we expect next (since there's only one valid closing symbol at a time). */

public class 20ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                a.push(')');
            } else if (s.charAt(i) == '[') {
                a.push(']');
            } else if (s.charAt(i) == '{') {
                a.push('}');
            } else {
                if (a.isEmpty()) {
                    return false;
                }
                if (a.peek() != s.charAt(i)) {
                    return false;
                }
                a.pop();
            }
        }
        return a.size() == 0;
    }
}
