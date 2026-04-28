public class ReverseString {
    public static String newString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        return sb.toString();
    }

    public static String reverseString(String S) {
        String s = "abcde";
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        newString("honey");
        reverseString("abcde");
    }

}
