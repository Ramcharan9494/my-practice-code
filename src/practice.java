import java.util.*;
public class practice {
    // fibinocci
//     public static void main(String[] args){
//         int f=0;
//         int s=1;
//         int n=10;
//         int t;
//         System.out.println("print the first numbr"+f);
//         System.out.println("print second number"+s);


//         for (int i=2;i<=n;i++){
//             t=f+s;
//             f=s;
//             s=t;
//             System.out.println(t);
//         }

        

//     }

// public static void main(String[] args){
//     int n=5;
//     int fact=1;
//     int sum=0;
//     int i=1;
//     while(i<=n){
//         fact=fact*i;
//         sum=fact;
//         i++;
//         System.out.println(sum);
//     }
// }
    

// max number b/w two numbers

// public static void main(String[] args){
//     int a,b;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the value of a:");
//     a=sc.nextInt();
//     System.out.println("enter the value of b:");
//     b=sc.nextInt();
//     if(a>b){
//         System.out.print("the max value is:"+a);

//     }
//     else{
//         System.out.println("the max number is:"+b);
//     }



// }

// // sum of numbers
// public static void main(String[] args){
//     int num=1234;
//     int sum=0;
//     int id;
//     while(num>0){
//         id=num%10;   
//         sum += id;
//         num=num/10;
        

//     }
//     System.out.println(sum);
// }

// functions

public static void main(String[] args){
    // int a=20;
    // int b=15;
    // int c=45;
    // int max = findmaxvalue (a,b,c);
    // System.out.println("the max number is:"+max);
    // int min = findminvalue (a,b,c);
    // System.out.println("the min value is:"+min);

    // }
    // static int findmaxvalue (int a,int b,int c){
    //     int max=a;
    //     if(b>max){
    //         max=b;
    //     }
    //     if(c>max){
    //         max=c;
    //     }
    //     return max;
    // }
    // static int findminvalue(int a,int b,int c){
    //     int min=a;
    //     if(b<min){
    //         min=b;
    //     }
    //     if(c<min){
    //         min=c;
    //     }
    //     return min;

    // int n=28;
    // int sum=0;
    
    // for (int i=1;i<=n-1;i++){
    //     if(n%i==0){
    //         sum +=i;
    //     }
        
    // System.out.print(sum);
//     }
//     if(n==sum){
//         System.out.println("it is perfect");
//     }else{
// System.out.println("not");
//     }

        // int n=5;

        // for (int i=1;i<=n;i++){
        //     if(n%1==0 && n%n==0){
        //         System.out.print("prime");
        //     }else{
        //         System.out.print("not prime");
        //     }
        // }
    
        //     String  s="hannah";
        //     String new_s=" ";
        //     int n=s.length();
        //     for(int  i=n-1;i>=0;i--){
        //         new_s+=s.charAt(i);
                
        //     }
        // System.out.println(new_s);


    
    String s="5347";
    int num_s=0;
    int n=s.length();
    for (int i=0;i<=n-1;i++){
        if(i%2 !=0){
            num_s=(i*10)/10;
        }
        System.out.print(num_s);
    }
    } 



}
