import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another
 * expression.
 * 
 * Some examples: 
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9 
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 * @author calvinliu
 * @Solution stack
 */
public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		String[] tokens = {"4", "13", "5", "/", "+"};
		System.out.println(new EvaluateReversePolishNotation().evalRPN(tokens));
	}

    public int evalRPN(String[] tokens) {
        Set<String> set = new HashSet<String>();
        set.add("+");set.add("-");set.add("*");set.add("/");
        int ret = 0, i1 = 0, i2 = 0;
        Stack<String> stack = new Stack<String>(); 
    	for (int i = 0; i < tokens.length; i++) {
    		if (set.contains(tokens[i])) {
    			i1 = Integer.parseInt(stack.pop());
				i2 = Integer.parseInt(stack.pop());
    		}
			switch (tokens[i]) {
			case "+":
				ret = i1 + i2;
				stack.push(String.valueOf(ret));
				break;
			case "-":
				ret = i2 - i1;
				stack.push(String.valueOf(ret));
				break;
			case "*":
				ret = i2 * i1;
				stack.push(String.valueOf(ret));
				break;
			case "/":
				ret = i2 / i1;
				stack.push(String.valueOf(ret));
				break;
			default:
				stack.push(tokens[i]);
				break;
			}
		}
    	return Integer.parseInt(stack.peek());
    }
}
