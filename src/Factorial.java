public class Factorial {
    public Integer factorial(int number) {
       if(number<2) return 1;
       else return number*factorial(number-1);
    }
}
