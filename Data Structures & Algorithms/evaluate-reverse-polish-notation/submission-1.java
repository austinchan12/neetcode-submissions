class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String c: tokens) {
            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                stack.push(operation(stack, c));
            } else {
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.pop();
    }

    private int operation(Stack<Integer> stack, String c) {
        int second = stack.pop();
        int first = stack.pop();
        return switch (c) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            case "/" -> first / second;
            default -> 0;
        };
    }
}
