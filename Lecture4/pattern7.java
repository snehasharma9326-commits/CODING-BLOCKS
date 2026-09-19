package Lecture4;
public class pattern7{
  public static void main(String[] args){
        int n = 5;
        int row=0;

        while(row<n){
            //star print 
            int col = 0;
            while (col<n){
              
               
                if(col==0 || col==n-1 || row== 0 || row == n-1){
                    System.out.print("* "); 
                }
                else{
                       System.out.print("  "); 
                }

                col++;
            }
            
         //next line prep.....
          System.out.println();
         row++;
        }
    }
}