public class concatenation {
    public static void main(String[] args){
        System.out.println('a' + 'b');
        //Here 'a' and 'b' are characters and when we add them it gives us the sum of their ascii values which is 195.
        System.out.println("a" + "b");
        //Here "a" and "b" are strings and when we add them it concatenates them and gives us "ab".
        System.out.println("a" + 1);
        //Here "a" is a string and 1 is an integer and when we add them it concatenates them and gives us "a1".
        System.out.println('a' + 1);
        //Here 'a' is a character and 1 is an integer and when we add them it gives us the sum of their ascii values which is 98.   
        System.out.println('a' + 'b' + "c");
        //Here 'a' and 'b' are characters and "c" is a string. When we add 'a' and 'b' it gives us the sum of their ascii values which is 195 and when we add "c" to it, it concatenates it and gives us "195c".
        //We atleast need one string in the expression to get the output as a string. If we have only characters and integers then we will get the output as an integer which is the sum of their ascii values.
    }
}
