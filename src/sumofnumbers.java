import java.util.*;
public class sumofnumbers {
   public static void main(String[] args){
    int num=1234;
    int sum=0;
    int ld;
    while(num>0){
        ld=num%10;
        sum +=  ld; //if want reverse sum = sum*10 + ld
        num=num/10;
       
        


    }
    System.out.println(sum);

   } 
}
