  import java.util.Scanner;
public class Armstrong {


    public static void getArmstrong(int num){
        int rem,temp=num;
        int sum=0;
        while(num>0){
        rem=num%10;
        sum+=(rem*rem*rem);
        num/=10;
        }
        if(sum==temp){
            System.out.println("Num is Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num:");
        int num=sc.nextInt();
       getArmstrong(num);
    }
}

