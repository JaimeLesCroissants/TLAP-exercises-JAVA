public class DontRun {
    public static void main(String args[]) {
     for(int i=0;i<5;i++){
         for(int j=0;j<7;j++){
           try{
           Thread.sleep(100);
             if((j==0&&i<2)||i==2||j==3||(i>2&&j==6)||(i==0&&j>2)||(i==4&&j<3)){
                 System.out.print("#");
             }else{
                 System.out.print(" ");
             }
           }catch(Exception e){
             e.printStackTrace();
           }
         }
         System.out.println("");
     }
    }
}