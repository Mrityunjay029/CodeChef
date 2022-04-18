import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int arr[] = new int[26];
		    for(int i=0;i<26;i++)
		    arr[i] = sc.nextInt();
		    
		    String s = sc.next();
		    s = s.toLowerCase();
		    
		    int sum = 0;
		    int index = 0;
		    String check = "abcdefghijklmnopqrstuvwxyz";
		    int z[] = new int[26];
		    for(int i=0;i<s.length();i++){
		        index = check.indexOf(s.charAt(i));
		        z[index]++;
		    }
		    for(int i=0;i<z.length;i++){
		        if(z[i] == 0){
		            sum = sum + arr[i];
		        }
		    }
		    System.out.println(sum);
		}
	}
}
