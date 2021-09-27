public class HighestSales{
  public static void main(String[] args){
    int salesArray[][] = {
      {1856, 498, 30924, 87478, 328, 2653, 387, 3754, 387587, 2873, 276, 32},
      {5865, 5456, 3983, 6464, 9957, 4785, 3875, 3838, 4959, 1122, 7766, 2534},
      {23, 55, 67, 99, 265, 376, 232, 223, 4546, 564, 4544, 3434}
    };
    
    int highestSales=salesArray[0][0];
    for(int agent=0;agent<salesArray.length;agent++){
      for(int sales=0;sales<12;sales++){
        if(salesArray[agent][sales]>highestSales){
          highestSales=salesArray[agent][sales];
        }
      }
    }
    System.out.println(highestSales);
  }
}