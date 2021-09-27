import java.io.*;
public class ISBN{
  public static void main(String[] args){
    try{
      BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
      int a=r.read();
      int position=1;
      int last=0;
      int sum=0;
      while(a!=10){
        int num=a-'0';
        if(position==12){
          last=num;
          break;
        }
        if(position%2==0){
          sum+=num*3;
        }else{
          sum+=num*1;
        }
        position++;
        a=r.read();
      }
      int res=sum%10;
      if(res!=0){
        res=10-res;
      }
      if(res==last){
        System.out.println("Correct!");
      }else{
        System.out.println("Incorrect!");
      }
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}