public class Pow {
     public static  double myPow(double x, int n) {
        if (n < 0) {
            x = 1 / x;
            if (n == Integer.MIN_VALUE) {
                return x * myPow(x, -(n + 1)); 
            }
            n = -n;
        }
        return fastPow(x, n);
    }
    private static double fastPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else { 
            return half * half * x;
        }
    }
    public static void main(String[] args) {
        double x=2.5;
        int n=4;
       System.out.println(myPow(x,n)); 
    }
}
