class Solution {
    public boolean isValid(String s) {
        boolean result = true;
        Deque<Character> stack = new ArrayDeque<>();

        if (s.length() == 0) {
            return false;
        }

        else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                    stack.push(s.charAt(i));

                else if (s.charAt(i) == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        result = false;
                        break;
                    }
                }

                else if (s.charAt(i) == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        result = false;
                        break;
                    }
                }

                else if (s.charAt(i) == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        result = false;
                        break;
                    }
                }
            }
        }

        if (result==true && !stack.isEmpty())
            result = false;

        return result;
    }
}
