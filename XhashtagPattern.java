public class XhashtagPattern {
    public static void main(String args[]) {
        int a=0;
        int b=13;
        int c=13;
        int d=1;
        int f=10;
        int g=7;
     for(int i=0;i<8;i++){
         if(i<4){
            for(int j=0;j<7;j++){
                if(j<i||j>a){
                     System.out.print(" ");
                }else{
                     System.out.print("#");
                }
            }
            a+=2;
            for(int j=7;j<14;j++){
                 if(j>b||j<c){
                     System.out.print(" ");
                }else{
                     System.out.print("#");
                }
            }
            b--;
            c-=2;
         }else{
             for(int j=7;j>0;j--){
                 if(j>i||j<d){
                     System.out.print(" ");
                 }else{
                     System.out.print("#");
                 }
             }
             d+=2;
             for(int j=7;j<14;j++){
                 if(j>f||j<g){
                     System.out.print(" ");
                 }else{
                     System.out.print("#");
                 }
             }
             f++;
             g+=2;
         }
         System.out.println("");
     }
    }
}