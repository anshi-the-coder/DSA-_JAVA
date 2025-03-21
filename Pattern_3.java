import java.util.*;
public class Pattern_3{
    public static void main(String args[]){
        
        int n = 5;
        int sp=n-1;
        int st=1;
        for(int i=1;i<=n;i++){
           // System.out.print(sp+ "," + st);
           for(int j=1;j<=sp;j++){
            System.out.print("\t");
           }
           for(int j=1;j<=st;j++){
            System.out.print("*\t");
           }
            sp--;
            st++;
            System.out.println();
        }
    }
}