package Lecture4;
public class pattern4{
  public static void main(String[] args){
        int n = 5;
        int row=0;
        int star =1;
        int space=n-1;
        
        while(row<n){
    
            //space 
             int  i=0;
            while (i<space){
               System.out.print("  ");
                i++;
            }
            //star
           int j=0;
            while(j<star){
               System.out.print("* "); 
               j++;
            }
         //next line prep.....
          System.out.println();
         row++;
         star++;
         space--;

        }
    }
}