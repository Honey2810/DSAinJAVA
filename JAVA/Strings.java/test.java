public class test {
    public static void main(String[] args) {
        String s = "banana";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'n') {
                count++;
            }
        }
        System.out.println(count);
    }
}
