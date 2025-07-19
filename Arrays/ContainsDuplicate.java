import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    //  public static boolean containsDuplicate(int[] nums) {
    //   Set <Integer> getseen =new HashSet<>();
    //   for(int num :nums){
    //     if(!getseen.add(num)){
    //         return true;
    //     }
    //   }
    //   return false;
    // }
     public static boolean containsDuplicate(int[] nums) {
      Set <Integer> getseen =new HashSet<>();
      for(int num :nums){
        if(!getseen.add(num)){
            return true;
        }
      }
      return false;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        boolean findContains=containsDuplicate(nums);
        System.out.println(findContains);
    }
}
