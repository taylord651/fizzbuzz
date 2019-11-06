
def fizzbuzz_program(number):
    number_int = int(number)
    if number_int % 5 == 0 and number_int % 3 == 0:
        return "FizzBuzz"
    elif number_int % 5 == 0:
        return "Buzz"
    elif number_int % 3 == 0:
        return "Fizz"
    else:
        return "Number is not divisible by 3 or 5"

def main():
    number = input("Enter a number between 1 and 100: ")
    print (fizzbuzz_program(number))

if __name__ == '__main__':
    main()
