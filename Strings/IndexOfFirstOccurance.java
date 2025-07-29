public class IndexOfFirstOccurance {
     public static  int strStr(String haystack, String needle) {
        int firLen=haystack.length();
        int secLen=needle.length();

        if(secLen == 0){
            return 0;
        }
        if(secLen>firLen){
            return -1;
        }

        for(int i=0;i<=firLen-secLen;i++){
              boolean found = true;
            for(int j=0;j<secLen;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    found=false;
                    break;
                }
            }
            if(found){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack="sadbutsad";
         String needle="sad";
         System.out.println(strStr(haystack, needle));
    }
}
