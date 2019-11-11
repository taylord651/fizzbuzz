// import scanner
import java.util.Scanner;

public class FizzBuzz
{
    public static void main(String[] args){
        int number;
        Scanner in;

        // Get number by user
        in = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        number = in.nextInt();
        

        
    //Determine whether to print Fizz, Buzz or FizzBuzz
    if (number % 3 == 0 & number % 5 == 0) {
        System.out.println("FizzBuzz");}
    else if (number % 3 == 0) {
        System.out.println("Fizz");}
    else if (number % 5 == 0) {
        System.out.println("Buzz");}
    else {
        System.out.println("Number is not divisible by 3 or 5");
    }
    
}
}