import java.util.*;
public class PattrnReverse{
    public static void main(String args[]){
        int i =5;
        for(i=5;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}