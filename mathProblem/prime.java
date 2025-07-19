public class prime {
    public static boolean isprime(int n){
          int i=2;
        while( i<=n-1){
            if(n%i==0){
               
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=33;
        System.out.println(isprime(n));
        }
}
