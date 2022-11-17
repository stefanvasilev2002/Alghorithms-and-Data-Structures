import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ExpressionEvaluator {
    public static int evaluateExpression(String expression) {
        Stack<Integer> numbers = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            int number = 0;
            char a = expression.charAt(i);
            if (a != '+' && a != '*') {

                while (a != '+' && a != '*' && i < expression.length()) {
                    a = expression.charAt(i);
                    number = number * 10 + Character.getNumericValue(a);
                    i++;
                }
                numbers.push(number);
            }
        }
        int b=numbers.size();
        for(int i=0; i<b; i++){
            System.out.println(numbers.pop());
        }

        return 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(evaluateExpression(input.readLine()));
    }
}