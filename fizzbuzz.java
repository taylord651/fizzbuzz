public class FizzBuzz
{
    public static void main(String[] args){
        
        //Loops through numbers 1 - 100

        for (int number = 1; number < 101; number++) {
            if (number % 3 == 0 & number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Number is not divisible by 3 or 5");
            }
        }

    }
}