public class ReplaceExample {
    public static void main(String[] args) {
        String text = "I love apples and apples are sweet";

        // Using replace
        System.out.println(text.replace('a', 'o'));  // "I love opples ond opples ore sweet"

        // Using replace with words
        System.out.println(text.replace("apples", "bananas"));  // "I love bananas and bananas are sweet"

        // Using replaceAll with regex (replace vowels with *)
        System.out.println(text.replaceAll("[aeiou]", "*"));  // "I l*v* *ppl*s *nd *ppl*s *r* sw**t"

        // Using replaceFirst (change only first "apples")
        System.out.println(text.replaceFirst("apples", "oranges"));  // "I love oranges and apples are sweet"
    }
}
