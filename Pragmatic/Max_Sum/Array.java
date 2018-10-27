
package array;
import java.util.Scanner;

/**
 *
 * @author Klajdi
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner s=new Scanner(System.in);

        System.out.println("Enter the number of elements");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter Elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();

        }
 
  int[] result = findMaxSumIndex(arr);//array that contains three values:start index,end index and Max Sum
  System.out.println("Start index :"+result[0]);
  System.out.println("End index :"+result[1]);
  System.out.println("Max Sum :"+result[2]);
  
}
    private static int[] findMaxSumIndex(int[] arr){
  int[] result = new int[3];
  int maxSum = Integer.MIN_VALUE;//stanadart function from java library tha holds the minimum value
 
  int tempStartIndex = 0;
  int tempSum = 0;//temporary variable that will be used to check the max sum during the iterations
 
  for (int i = 0; i < arr.length; i++) {
   tempSum = tempSum + arr[i];
 
   if(tempSum > maxSum){
    maxSum = tempSum;
    result[0] = tempStartIndex;
    result[1] = i;
    result[2] = maxSum;
   }
 
   if(tempSum<0){
    tempSum = 0;
    tempStartIndex = i + 1;
   }
  }
  return result;
 }
}