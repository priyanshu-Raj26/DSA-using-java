import java.util.Stack;

public class Problem_04 {

    public static int trapWater(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int waterTrapped = 0;

        for (int i = 0; i < height.length; i++) {
            // Process bars that are smaller than current bar
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int bottom = stack.pop(); // The bottom of the valley

                if (stack.isEmpty()) {
                    break; // No left boundary to trap water
                }

                int distance = i - stack.peek() - 1; // Width between left and right bar
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[bottom];

                // Only add water if boundedHeight is positive
                if (boundedHeight > 0) {
                    waterTrapped += distance * boundedHeight;
                }
            }

            stack.push(i); // Push current bar index
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Total trapped water = " + trapWater(height));
    }
}
