import java.io.*;
public class DecodeMsg{
  
  public static void main(String[] args){
    DecodeMsg d=new DecodeMsg();
    int a;
    int mode=0;
    String ans="";
    try{
      BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
      do{
        a=r.read();
        int numbr=a-'0';
        a=r.read();
        while((a!=10)&&(a!=44)){
          numbr=numbr*10+(a-'0');
          a=r.read();
        }
        if(numbr%27==0){
          mode=(mode+1)%3;
          continue;
        }else if(mode==2&&numbr%9==0){
          mode=(mode+1)%3;
          continue;
        }
        if(mode==0){
          int uppr=numbr%27;
          int asc=d.numToLetr(uppr,mode);
          ans+=(char)asc;
        }else if(mode==1){
          int lowr=numbr%27;
          int asc=d.numToLetr(lowr,mode);
          ans+=(char)asc;
        }else{
          int symb=numbr%9;
          int asc=d.numToLetr(symb,mode);
          ans+=(char)asc;
        }
      }while(a!=10);
       System.out.println(ans);
    }catch(Exception e){
      e.printStackTrace();
    }
  
  }
  public int numToLetr(int a,int mode){
    if(mode==0){
      return a+64;
    }else if(mode==1){
      return a+96;
    }else{
      int num=0;
      switch(a){
        case 1:num=33;break;
        case 2:num=63;break;
        case 3:num=44;break;
        case 4:num=46;break;
        case 5:num=32;break;
        case 6:num=59;break;
        case 7:num=34;break;
        case 8:num=39;break;
      }
      return num;
    }
  }
}