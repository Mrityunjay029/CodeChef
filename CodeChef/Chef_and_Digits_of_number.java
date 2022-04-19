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
		    String n = sc.next();
		    char charr[] = n.toCharArray();
		    int count0=0;
		    int count1=0;
		    for(int i=0;i<charr.length;i++){
		        if(charr[i] == '0')
		        count0++;
		        else
		        count1++;
		    }
		    if(count0 == 1 || count1 == 1)
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
