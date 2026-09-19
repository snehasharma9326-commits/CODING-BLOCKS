package Lecture4;
public class pattern1{
  public static void main(String[] args){
        int n = 5;
        int row=0;

        while(row<n){
            //star print 
            int col = 0;
            while (col<n){
               System.out.print("*");
                col++;
            }
         //next line prep.....
          System.out.println();
         row++;
        }
    }
}