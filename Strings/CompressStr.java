public class CompressStr {
      public static int compress(char[] chars) {
       int i=0;
       int writeIndex=0;

       while(i<chars.length){
        int j=i;
        while(j<chars.length && chars[j]==chars[i]){
            j++;
        }
        int count=j-i;
        chars[writeIndex++]=chars[i];

        if(count>1){
            char[] countChars=String.valueOf(count).toCharArray();

            for(char c:countChars){
                chars[writeIndex++]=c;
            }
        }
        i=j;
       }
       return writeIndex;
    }
    public static void main(String[] args) {
        char[] chars={'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }
}
