package Lecture4;
public class pattern3{
  public static void main(String[] args){
        int n = 5;
        int row=0;
        int star =n;
        while(row<n){
            //star print 
            int col = 0;
            while (col<star){
               System.out.print("*");
                col++;
            }
         //next line prep.....
          System.out.println();
         row++;
         star--;

        }
    }
}