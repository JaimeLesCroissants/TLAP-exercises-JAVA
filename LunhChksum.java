import java.io.*;

public class LunhChksum{
  public static void main(String[] args){
    LunhChksum ln=new LunhChksum();
    try{
      BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
      int evenChecksum=0;
      int oddChecksum=0;
      int position=1;
      int inp=r.read();
      while(inp!=10){
        if(position%2>0){
          int dbl=ln.doubleIt(inp-'0');
          evenChecksum+=dbl;
          oddChecksum+=(inp-'0');
        }else{
          int dbl=ln.doubleIt(inp-'0');
          oddChecksum+=dbl;
          evenChecksum+=(inp-'0');
        }
        ++position;
        inp=r.read();
      }
      if((position-1)%2==0){
        if(evenChecksum%10==0){
          System.out.println("Valid");
        }else{
          System.out.println("Invalid");
        }
      }else{
        if(oddChecksum%10==0){
          System.out.println("Valid");
        }else{
          System.out.println("Invalid");
        }
      }
    }catch(Exception e){
      e.printStackTrace();
    }
  }
  
  public int doubleIt(int digit){
    int res=0;
    int doble=digit*2;
    if(doble>9){
      res=1+(doble%10);
    }else{
      res=doble;
    }
    return res;
  }
}