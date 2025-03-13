import java.util.*;
public class ConditionalStatement{
    public static void main(String args[]){
        int a = 20;
        int b = 30;
        if(a==b){
            System.out.println(a + " is equal to " + b);
        }
        else if(a>b){
            System.out.println(a + " is Greater to " + b);
        }
        else{
            System.out.println(a + " is smallerto " + b);
        }
    }
}