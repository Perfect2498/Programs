package Recursion.Easy;

public class Fibonacci {
    
    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2); 
    }

    public static void main(String[] args) {
        
        System.out.println(fibonacci(5));

    }
}
