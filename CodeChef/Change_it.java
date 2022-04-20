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
		while(t-- > 0) {
		    int size = sc.nextInt();
		    int inputs[] = new int[size];
		    int frequency[] = new int[100];
		    int max = 0;
		    for(int i = 0; i < size; i++) {
		        int x = sc.nextInt();
		        inputs[i] = x;
		        frequency[x-1]++;
		        if(max < frequency[x-1])
		            max = frequency[x-1];
		    }
		    System.out.println(size-max); 
		}
	}
}
