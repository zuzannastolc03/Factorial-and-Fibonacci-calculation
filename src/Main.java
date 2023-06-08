public class Main {
    public static void main(String[] args) {
        int i = 6;
        System.out.println("The factorial of " + i + " equals " + new Factorial().factorial(i));
        System.out.println(i + "-th element of the Fibonacci series equals " + new Fibonacci().fibonacci(i));
        }
}