
import java.util.*;
public class ternary {
   /*  public static void main(String[] args){
        int a=10,b=30,c=29;
        if (a>b){
            if(a>c){
                System.out.println("a is big");
    
            }
        }
        if(b>a){
            if(b>c){
                System.out.println("b is big");
            }
        }
        if(c>a){
            if(c>b){
                System.out.print("c is big");
            }
        }
    }
    */
   
   
   
   
    public static void main(String[] arsg){
        int a=10,b=30,c=48;
        String largest =" ";
        largest = (a>b && a>c)? "a":(b>a && b>c) ? "b":(c>a && c>b)? "c" :" ";
        System.out.println(largest);

    }
}
