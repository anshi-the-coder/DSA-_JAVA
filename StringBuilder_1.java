import java.util.*;
public class StringBuilder_1{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("h");
        sb.append('e');  //str= str+'e'
        sb.append('l');  //str= str+'l'
        sb.append('l');
        sb.append('o');
        System.out.println(sb.length());

        

        //char at index 0;
        // System.out.println(sb.charAt(0));

        // //set char at index 0
        // sb.setCharAt(0,'V');
        // System.out.println(sb);

        // sb.insert(2,'n');
        // System.out.println(sb);

        // //delete the extra 'n'
        // sb.delete(2,4);
        // System.out.println(sb);
    }
}