import java.util.*;
public class function {
    public static void main (String[] args){
        int a=10;
        int b=15;
        int c=20;
        // String big=" ";
        //  int max=0;
        int max = findmaxvalue (a,b,c);
        System.out.println("the maximum no is"+ max);
        int min = findminvalue(a,b,c);
        System.out.println("the minimum number is "+min);
    }
        static int findmaxvalue(int a,int b,int c){
            int max=a;
            if(b>max){
                max=b;
            }
            if(c>max){
            }
            return max;
        
        }
        static int findminvalue(int a,int b,int c){
            int min=a;
            if(b<min){
                min=b;
            }
            if(c<min){
                min=c;
            }
            return min;
        }

   
    
}

