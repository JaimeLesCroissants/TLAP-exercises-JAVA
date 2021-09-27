import java.util.*;
public class SubCipher{
  public static void main(String[] args){
    String lett="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Scanner sc=new Scanner(System.in);
    int option=0;
    String inp=sc.nextLine();
    int cipherNum=2;
    if(option==0){
      char[] chars=inp.toCharArray();
      char[] res=new char[inp.length()];
      for(int i=0;i<chars.length;i++){
        int a=lett.indexOf(chars[i]);
        int b=(a+cipherNum)%26;
        res[i]=lett.charAt(b);
      }
      String ans=new String(res);
      System.out.println(ans);
    }else if(option==1){
      char[] chars=inp.toCharArray();
      char[] res=new char[inp.length()];
      for(int i=0;i<chars.length;i++){
        int a=lett.indexOf(chars[i]);
        int b=(a-cipherNum+26)%26;
        res[i]=lett.charAt(b);
      }
      String ans=new String(res);
      System.out.println(ans);
    }
  }
}