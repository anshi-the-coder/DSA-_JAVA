import java.util.*;
public class Pattern_1_Reverse{
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}