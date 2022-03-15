package codemate;

import java.util.ArrayList;
import java.util.List;

public class StackBracePair {

    public static void main(String[] args) {
        validateBracePair("{{}}{}");
        validateBracePair("{{}");
        validateBracePair("{{{}}}");
        validateBracePair("}{{{}}}{");
        validateBracePair("{}{{{}}}{}");
    }

    public static void validateBracePair(String value) {
        List<String> stack = new ArrayList<>();
        boolean isPair = true;

        for (String s : value.split("")) {
            if (s.equals("{")) {
                push(stack, s);
            } else if (s.equals("}") && stack.size() <= 0) {
                isPair = false;
                break;
            } else {
                pop(stack);
            }
        }
        if (stack.size() == 0 && isPair) {
            System.out.println("유효한 중괄호 쌍입니다.");
        } else {
            System.out.println("유효하지 않은 중괄호 쌍입니다.");
        }
    }

    public static void push(List<String> stack, String s) {
        stack.add(s);
    }

    public static void pop(List<String> stack) {
        stack.remove(stack.size() -1);
    }
}
