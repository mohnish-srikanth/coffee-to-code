import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        for(int i = 0; i <= A.length()/2; i++){
            if(A.charAt(i) == A.charAt(A.length() - i)){
                String output= "Yes";
            } else {
            	String output = "No";
                break;
            }
        }
        
        System.out.println(output);
    }
}



