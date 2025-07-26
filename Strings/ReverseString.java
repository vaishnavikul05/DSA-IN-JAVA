public class ReverseString{
     public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
       char s[]={'H','E','L','L','O'};
       System.out.println(s);
      reverseString(s);
      System.out.println(s);
    }
}