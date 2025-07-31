//      *              inverted Half Pyramid(rotated by 180 deg)
//     **
//    ***
//   ****  

import java.util.*;
public class InvertedHalfPyramid{
    public static void main(String args[]){
        int n=4;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop -> space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop ->start print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}