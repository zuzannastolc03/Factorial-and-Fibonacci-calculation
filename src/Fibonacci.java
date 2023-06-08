public class Fibonacci {
    public Integer fibonacci(int number_of_element){
        if(number_of_element<=2) return 1;
        else return fibonacci(number_of_element-1) + fibonacci(number_of_element-2);
    }
}
