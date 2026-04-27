import java.util.*;
class data{
    public Integer num;
    public String name;
    data(int _num , String _name){
        this.num= _num;
        this.name= _name;
    }
}
public class practice1 {
    public static void main(String[] args){
    data dataobj1=new data(9,"raj");
    data dataobj2=new data(7,"tuf");
    System.out.println(dataobj2);
    dataobj2.name="ram";
    System.out.println(dataobj1.name);
    
}}
