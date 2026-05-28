class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (closeToOpen.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (closeToOpen.get(c) != topElement) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
