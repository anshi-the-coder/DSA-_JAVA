import java.util.*;
public class Pattern_2_Reverse{
    public static void main(String args[]){
        int n=5;
        int sp=n+1;
        int st=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
}