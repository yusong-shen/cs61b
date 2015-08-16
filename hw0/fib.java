/** fib(N) returns the N
th Fibonacci number, for N ≥ 0.
* The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, ... */
public class Fib {
   public static int fib(int N) {
    int fn = 0, i = 0;
    int fn1 = 1, fn2 = 0;
    if (N == 0){
      fn = 0; 
    }
    else if (N == 1){
      fn = 1;
    }
    else {
      while(i < N){
        fn = fn1 + fn2;
        fn2 = fn1;
        fn1 = fn;
        i = i + 1;

      }

    }
    return f_n ;

    }
  public static int fib2(int n, int k, int f0, int f1) {

  }  
   public static void main(String[] args) {

      System.out.println(fib(5));  
   }
}