public class Fabonaci {
    public static int fib(int idx){
          if(idx == 0 || idx== 1) return idx;

        int first = 0;
        int second = 1;

        for(int i=2; i<=idx; i++){
            int res = first + second;
            first = second;
            second = res;
        }
        return second;
        
    }
    public static void main(String[] args) {
       int idx=6;
       System.out.println(fib(idx));
    }
}
