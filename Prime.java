import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();

            int count =0;
            for(int div =1;div<=n;div++){
                if(n%div==0){
                    count++;
                    
        }
    }
    if(count==2){
                    System.out.println("prime");
                }else{
                    System.out.println("Not prime");
                }
            }
            }
}