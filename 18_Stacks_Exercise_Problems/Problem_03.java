import java.util.*;

public class Problem_03 {
    
    public static String Decode(String s) {
       Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentNum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                currentNum = 0;
            } else if (ch == ']') {
                int repeatCount = countStack.pop();
                StringBuilder prevString = stringStack.pop();

                for (int j = 0; j < repeatCount; j++) {
                    prevString.append(currentString);
                }

                currentString = prevString;
            } else {
                if (!countStack.isEmpty()) {
                    currentString.append(ch);
                }
            }
        }

        return currentString.toString();
        }
        
        public static void main(String[] args) {
            String s = "3[b2[v]]l";
            
            System.out.println(Decode(s));
        }
    }

