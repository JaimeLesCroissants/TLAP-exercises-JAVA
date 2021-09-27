public class SortedOrNot{
  public static void main(String[] args){
    SortedOrNot son=new SortedOrNot();
    int[] arr={1,2,3,4,5,6,7,8};
    System.out.println(son.sortedOrNot(arr));
  }
  boolean sortedOrNot(int[] arr){
    for(int i=0;i<arr.length-2;i++){
      if(arr[i]>arr[i+1]){
        return false;
      }
    }
    return true;
  }
}