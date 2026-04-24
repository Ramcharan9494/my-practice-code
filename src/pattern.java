public class pattern {
   //inverse pattern
    /*public static void main(String[] args){
        int n=5;
      
        for(int i=1;i<=n;i++){
            //int space=i-1;
            for(int space=1;space<=i-1;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*"); 
            }
            System.out.println(); 
        
        }
        }*/

       //prg-1
      /*  public static void main(String[] args){
            int n=5;
            for (int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }*/ 

        //prg-2
      /*   public static void main(String[] args){
            int n=5;

            for(int i=1;i<=n;i++){
               int star=i-1;
               for(int j=1;j<=star+1;j++){
                System.out.print("*");
               }
               System.out.println();
            }
            
               
            }*/


          //prg-3
          
         /*  public static void main(String[] args){
            int n=5;

            for(int i=1;i<=n;i++){
                int star=n-i;
                for(int j=1;j<=star+1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

          }*/
         
         //prg-4

       /*   public static void main(String[] args){
           int n=6;
           //int nn;
           //int sum;
           for(int i=1;i<=n;i++){
            int sp=i-1;

          for(int j=1;j<=sp-1+1;j++){
            System.out.print(j);
          }
          System.out.println();
           }
           


     }*/
 
       //prg-5
    /*  public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            int star=i-1;
           for(int j=1;j<=star+1;j++){
           System.out.print("*");
           
           }
           
           System.out.println();
            }
           for(int k=1;k<=n;k++){
            for(int j=1;j<=n-k;j++){
                System.out.print("*");
            }
           System.out.println(); 
           }
            }*/



            //prg-6
         /*   public static void main(String[] args){
            int n=5;

            for (int i=1;i<=n;i++){
                int space=n-i;
                for(int k=1;k<=space;k++){
                    System.out.print(" ");
                }
                
                 int star=i-1;
                for(int j=1;j<=star+1;j++){
                    System.out.print("*");
                }
                
                
                System.out.println();  
            }
            
            
            
     
        }*/

        //prg-7

       /*  public static void main(String[] args){
            int n=5;
            for(int i=1;i<=n;i++){
                for (int j=1;j<=n;j++){
                    if(i+j<=n){
                        System.out.print("*");
                    }
                        else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
                
            
    }*/

    // prg-7

   /* public static void main(String[] args){
        int n=5;
        for(int i=0;i<=n;i++){
            
           for(int j=0;j<=i+1;j++){
           if(i+j>=n){
            System.out.print("*");
           }
           else{
            System.out.print(" ");
           }
        }
        System.out.println();
    }

    }*/ 

    //prg-8

    public static void main(String[] args){
        int n=5;
        for(int i=0;i<=n;i++){
            int star=n;
            for(int j=0;j<=star-i;j++){
                if(i+j<=n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 
           
            
            
           
           
           
     
    


       
    
    

