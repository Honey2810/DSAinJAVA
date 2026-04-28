public class PrettyPrinting {
    public static void main (String[] args){
        float a = 453.1234567f;
        System.out.printf("the value of a is %.2f",a);
    }
}
//Here % is place holder for the value to be printed.
//.2 is uded to specify the number of digits after the decimal point.
//f is used to specify that the value is a float.
//printf rounds of as well 
