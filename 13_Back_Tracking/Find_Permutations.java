public class Find_Permutations {

    public static void FindPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // O(n * n!)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            FindPermutations(Newstr,ans+curr);
        }
    }

    
    public static void main(String[] args) {
        String str = "abc";
        FindPermutations(str,"");
    }
}
