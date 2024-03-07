import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("BMW");
        stack.push("Audi");
        stack.push("Ferrari");
        stack.push("Bugatti");
        stack.push("Jaguar");
        stack.pop();

        if (stack.isEmpty() == false) {
            System.out.println("The length of the array: " + stack.search(stack.peek()));
        }

        Iterator iterator = stack.iterator();
        while (iterator.hasNext()) {
            Object values = iterator.next();
            System.out.println(values);
        }
        

    }

}