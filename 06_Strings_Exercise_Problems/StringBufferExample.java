public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Append (Add text)
        sb.append(" World");
        System.out.println(sb); // Output: Hello World

        // Insert text at a specific position
        sb.insert(5, " Java");
        System.out.println(sb); // Output: Hello Java World

        // Replace characters
        sb.replace(6, 10, "Python");
        System.out.println(sb); // Output: Hello Python World

        // Delete characters
        sb.delete(6, 12);
        System.out.println(sb); // Output: Hello World

        // Reverse the string
        sb.reverse();
        System.out.println(sb); // Output: dlroW olleH
    }
}
