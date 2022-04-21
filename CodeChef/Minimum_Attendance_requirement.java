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
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    int present=0;
		    for(int i=0;i<s.length();i++){
		        if(s.charAt(i) == '1')
		        present++;
		    }
		    double a = (120-n)+present;
		    if((a/120) * 100 >= 75)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
