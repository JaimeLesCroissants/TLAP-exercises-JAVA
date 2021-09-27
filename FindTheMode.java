import java.util.*;
public class FindTheMode{
  public static void main(String[] args){
    int[] arr={4, 7, 3, 8, 9, 7, 3, 9, 9, 3, 3, 10};
    int[] temp=new int[arr.length];
    int max=0;
    int index=0;
    for(int i=0;i<arr.length;i++){
      temp[arr[i]]+=1;
    }
    for(int j=0;j<temp.length;j++){
      if(temp[j]>max){
        max=temp[j];
        index=j;
      }
    }
   System.out.println("Mode is "+index+" appears "+max+" times.");
  }
}