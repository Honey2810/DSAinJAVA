public class StringPerformance {
    public static void main(String[] args){
        String s = "";
        for(int i = 0 ; i < 26 ; i++){
            char ch = (char)('a' + i);
            System.out.println(ch);
            s = s + ch; // this is a very costly operation as it creates a new string every time and copies the old string to the new string and then adds the new character to the new string.
            System.out.println(s);
        }
    }
}
