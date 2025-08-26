import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;

class Solution {
    /**
     * Checks if a string has valid parentheses.
     * Only (), {}, and [] are considered valid pairs.
     *
     * @param s the input string
     * @return true if valid, false otherwise
     */
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put(')', '(');
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');

        for (char c : s.toCharArray()) {
            if (bracketMap.containsKey(c)) {
                // Closing bracket: must match the top of the stack
                if (stack.isEmpty() || stack.pop() != bracketMap.get(c)) {
                    return false;
                }
            } else if (bracketMap.containsValue(c)) {
                // Opening bracket
                stack.push(c);
            } else {
