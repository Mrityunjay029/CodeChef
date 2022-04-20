import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int sumL=0;
		    int sumB=0;
		    int i = 1;
		    while(m-i>=0 || n-i>=0){
		        if(i%2!=0 && m-i>=0){
		            m=m-i;
		            sumL+=i;
		        }
		        else{
		            if(n-i>=0){
		            n=n-i;
		            sumB+=i;
		            }
		        }
		        i++;
		    }
		    if(sumL>sumB)
		    System.out.println("Limak");
		    else
		    System.out.println("Bob");
		}
	}
}
