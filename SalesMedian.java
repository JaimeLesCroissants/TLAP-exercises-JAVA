import java.util.*;
public class SalesMedian{
  public static void main(String[] args){
    int sales[][] = {
      {1856, 498, 30924, 87478, 328, 2653, 387, 3754, 387587, 2873, 276, 32},
      {5865, 5456, 3983, 6464, 9957, 4785, 3875, 3838, 4959, 1122, 7766, 2534},
      {23, 55, 67, 99, 265, 376, 232, 223, 4546, 564, 4544, 3434}
    };
    
    int[] one=sales[0];
    Arrays.sort(one);
    int[] two=sales[1];
    Arrays.sort(two);
    int[] three=sales[2];
    Arrays.sort(three);
    
   int medianA=(one[(one.length-1)/2]+one[(one.length-1)/2+1])/2;
   int medianB=(two[(two.length-1)/2]+two[(two.length-1)/2+1])/2;
   int medianC=(three[(three.length-1)/2]+three[(three.length-1)/2+1])/2;
   System.out.println(medianA);
   System.out.println(medianB);
   System.out.println(medianC);
  }
}