
def fizzbuzz_program():
    # Loops through numbers 1 - 100
    for i in range(1,101):
        #Checks if i (number) is divisible by 3 and 5 first
        if i % 5 == 0 and i % 3 == 0:
            print ("FizzBuzz")
        elif i % 5 == 0:
            print ("Buzz")
        elif i % 3 == 0:
            print ("Fizz")
        else:
            print ("Number is not divisible by 3 or 5")

def main():
    # Calls the fizzbuzz_program
    fizzbuzz_program()

# Calls the main function
if __name__ == '__main__':
    main()
