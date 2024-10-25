package leetcodetest;

import java.util.Scanner;

public class Test {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for(int i = 0; i <= s.length() - 3; i+=1){
            String sub = s.substring(i, i + 3);
            // System.out.println(sub);
            if(i == 0){
                smallest = sub;
                largest = sub;
            }
            
            if(sub.compareTo(smallest) < 0){
                smallest = sub;
            } 
            
            if(sub.compareTo(largest) > 0){
                largest = sub;
            }
        }
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}