public class PrintDigit {

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void PrintDigit(int number) {
        if (number == 0) {
            return;
        }

        int lastDigit = number%10;
        PrintDigit(number/10);
        System.out.print(digits[lastDigit] + " ");
    }

    
    public static void main(String[] args) {
        PrintDigit(1947);
    }
}
