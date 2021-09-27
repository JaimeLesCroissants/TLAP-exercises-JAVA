import java.util.*;
public class WordProgramm{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    char[] b=a.toCharArray();
    int longest=0;
    int count=0;
    int words=0;
    for(int i=0;i<b.length;i++){
      if(i==(b.length-1))words++;
      if(b[i]!=' '){
        count++;
        longest=Math.max(longest,count);
      }else{
        count=0;
        words++;
      }
    }
    System.out.println(words+" "+longest);
  }
}