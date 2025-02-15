public class InternExample {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern(); // Moves "hello" to the String Pool

        // Checking references
        System.out.println(s1 == s2); // false (Different objects)
        System.out.println(s2 == s3); // true (Both refer to the same string in the pool)

        String a = new String("java").intern();
        String b = "java";

        System.out.println(a == b); // true (Same reference)

    }
}
