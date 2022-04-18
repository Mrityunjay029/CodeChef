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
		    int n = sc.nextInt();
		    int count0 = 0;
		    int count1 = 0;
		    int count2 = 0;
		    int count3 = 0;
		    String s1 = sc.next();
		    String s2 = sc.next();
		    char charr[] = s1.toCharArray();
		    char charr1[] = s2.toCharArray();
		    for(int i=0;i<n;i++){
		        if(charr[i] == '0')
		        count0++;
		        if(charr[i] == '1')
		        count1++;
		        if(charr1[i] == '0')
		        count2++;
		        if(charr1[i] == '1')
		        count3++;
		    }
		    if(count0 == count2 && count1 == count3)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
