
public class SubArray {

    public static void printSubArray(int arr[]) {
        int largest = Integer.MIN_VALUE;
       int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int s = i;
            for (int j = 0; j < arr.length; j++) {
                int e = j;
               sum = 0;
                for (int k = s; k <= e; k++) {
                    sum = sum + arr[k];
                }
               
                if (sum > largest) {
                    largest = sum;
                }
               
            }
            System.out.println(sum);
        }
        System.out.println("largest : " + largest);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        printSubArray(arr);
    }
}

