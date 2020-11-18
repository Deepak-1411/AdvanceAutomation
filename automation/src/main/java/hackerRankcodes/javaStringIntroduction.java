package hackerRankcodes;

import java.util.Scanner;

/**
 * The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
 * @author TGT117
 *
 */

public class javaStringIntroduction {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes" :"No");
        System.out.println(capFirst(A)+" "+capFirst(B));
    }
    
    private static String capFirst(String str){
        if(str==null || str.length()==0){
            return "";
        }else{
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }
    }

}
