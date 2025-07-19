import java.util.*;

public class Problem_02 {
    
        public static String simplifyPath(String path) {
        // Split the path by "/"
        String[] parts = path.split("/");

        // Use a stack to simulate the directory structure
        Stack<String> stack = new Stack<>();

        
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (part.equals("") || part.equals(".")) {
                // Ignore empty strings and "."
                continue;
            } else if (part.equals("..")) {
                // ".." means go up one level if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Valid directory name, push to stack
                stack.push(part);
            }
        }

        // Build the simplified path from the stack
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stack.size(); i++) {
            result.append("/").append(stack.get(i));
        }

        // If result is empty, return root "/"
        return result.length() == 0 ? "/" : result.toString();
        
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/apnacollege/"));    
        System.out.println(simplifyPath("/a/.."));            
        System.out.println(simplifyPath("/a/./b/../../c/")); 

    }
}
