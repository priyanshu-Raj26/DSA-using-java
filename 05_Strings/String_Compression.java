public class String_Compression {

    public static String toCompression(String str) {
        
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i < str.length(); i++) { //O(n)
            Integer count = 1;
             
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++; // O(n)
            }

            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            } 
        }

        return sb.toString();
    }

    
    public static void main(String[] args) {
        String str = "aaabbcccdd";

        System.out.println(toCompression(str));
    }
}
