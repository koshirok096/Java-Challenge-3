import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); 
        String TEMPS = in.nextLine(); 
        
        if( N > 0 ) {
            String list[] = in.nextLine().split(" ");
       
            int res = 10000;
            int temp = 0;
            for ( int i=0; i<list.length; i++ ) {
                temp = Integer.parseInt(list[i]);
                
                if ( Math.abs(temp) < Math.abs(res)) {
                    res = temp;
                }else if ( Math.abs(temp) == Math.abs(res) && temp != res){
                     res = Math.abs(temp);
                }
            }
            System.out.println(res);
        } else {
            System.out.println(0);
        }        
    }
}
